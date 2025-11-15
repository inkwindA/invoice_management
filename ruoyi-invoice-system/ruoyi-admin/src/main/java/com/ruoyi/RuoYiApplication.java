package com.ruoyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.ruoyi"})
@MapperScan("com.ruoyi.system.mapper")
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  RuoYi发票管理系统启动成功   ლ(´ڡ`ლ)ﾞ  ");
        System.out.println(" .-------.       ____     __        ");
        System.out.println(" |  _ _   \\      \\   \\   /  /    ");
        System.out.println(" | ( ' )  |       \\  _. /  '       ");
        System.out.println(" |(_ o _) /        _( )_ .'         ");
        System.out.println(" | (_,_).' __  ___(_ o _)'          ");
        System.out.println(" |  |\\ \\  |  ||   |(_,_)'         ");
        System.out.println(" |  | \\ `'   /|   `-'  /           ");
        System.out.println(" |  |  \\    /  \\      /           ");
        System.out.println(" ''-'   `'-'    `-..-'              ");
    }
}
