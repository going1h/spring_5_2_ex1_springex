package com.javaex.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//아직은 스프링의 DI사용에 따른 장점을 많이 느끼지 못할 수 있습니다. 또는 DI를 사용하니 더욱 복잡하고 시갂이 더 많이 소요된다고 생각 할 수 있습니다.
//사실 작은 규모의 프로젝트에서는 스프링의 DI사용을 하는 것 보다 일반적인 방법을 사용하여 개발하는 것이 더욱 빠르고, 개발에 따른 스트레스를 줄일 수 있습니다. 
//하지만 규모가 어느 정도 커지고, 추후 유지보수 업무가 발생시에는 DI를 이용한 개발의 장점을 느낄 수 있습니다

public class MainClass { // 

	public static void main(String[] args) {
		
	AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
	Pencil pencil = ctx.getBean("pencil", Pencil.class);
	Pencil pencil2 = ctx.getBean("pencil2", Pencil.class);
	Pencil pencil3 = ctx.getBean("pencil3", Pencil.class);
	
	pencil.use();
	pencil2.use();
	pencil3.use();
	
	ctx.close();
	}
}
