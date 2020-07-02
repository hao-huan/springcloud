package com.macro.cloud;


import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{


	public static String scanner(String tip){
		Scanner scanner = new Scanner(System.in);
		StringBuilder help = new StringBuilder();
		help.append("帅哥,请输入一下你的" + tip + ": " );
		System.out.println(help.toString());

		if (scanner.hasNext()) {
		  String ipt = scanner.next();
		  if(StringUtils.isNotEmpty(ipt)){
		      return ipt; 
		  }
		}

		throw new MybatisPlusException("请输入正确的" + tip + "! ");
	}



    public static void main( String[] args )
    {

	    AutoGenerator mpg = new AutoGenerator();
	    GlobalConfig gc = new GlobalConfig();
	    String projectPath = System.getProperty("user.dir");
	    String cloudBase = "/home/huanghao/java/springcloud/";
	    String moduleName = scanner("pom模块");
	//    System.out.println("projectPath : " + projectPath ); 
	    String outputDir = cloudBase+ moduleName + "/src/main/java";
	    gc.setOutputDir(outputDir);
	    gc.setAuthor("huanghao");
	    gc.setOpen(false);
	    gc.setSwagger2(true);
	    gc.setBaseResultMap(true);
	    gc.setIdType(IdType.AUTO);


	    gc.setEntityName(scanner("实体类名"));
	    gc.setControllerName(scanner("Controller名"));
	    gc.setServiceName(scanner("Service名"));
	    gc.setServiceImplName(scanner("ServiceImpl名"));

	    gc.setMapperName(scanner("Mapper名"));
	    gc.setXmlName(scanner("XML名"));

	    mpg.setGlobalConfig(gc);


	    DataSourceConfig dsc = new DataSourceConfig();
	    dsc.setUrl("jdbc:mysql://127.0.0.1:3306/seat-account?serverTimezone=Asia/Shanghai&characterEncoding=utf8&useSSL=false");
	    //dsc.setDriverName("com.mysql.cj.jdbc.Driver");
	    dsc.setDriverName("com.mysql.jdbc.Driver");
	    dsc.setUsername("root");
	    dsc.setPassword("123");
	    mpg.setDataSource(dsc);

	    PackageConfig pc = new PackageConfig();
	    pc.setModuleName(scanner("业务模块"));
	    pc.setParent("com.macro.cloud").setMapper("dao").setService("service").setController("controller").setEntity("model").setXml("dao.mapping");

	    mpg.setPackageInfo(pc);

	    StrategyConfig strategy = new StrategyConfig();
	    strategy.setNaming(NamingStrategy.underline_to_camel);
	    strategy.setColumnNaming(NamingStrategy.underline_to_camel);
	    strategy.setEntityLombokModel(true);
	    strategy.setRestControllerStyle(true); 
	    strategy.setSuperEntityClass("com.baomidou.mybatisplus.extension.activerecord.Model");
	    strategy.setSuperControllerClass("pro.nbbt.base.controller.BaseController");
	    strategy.setSuperServiceClass("com.baomidou.mybatisplus.extension.service.IService");
	    strategy.setSuperServiceImplClass("com.baomidou.mybatisplus.extension.service.impl.ServiceImpl");

	    strategy.setSuperMapperClass("com.baomidou.mybatisplus.core.mapper.BaseMapper");
	    strategy.setInclude(scanner("表名"));
	    strategy.setSuperEntityColumns("id");
	    mpg.setStrategy(strategy);


	    mpg.execute(); 
	    
    }
}
