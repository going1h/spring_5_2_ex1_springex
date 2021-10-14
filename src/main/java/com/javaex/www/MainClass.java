package com.javaex.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//������ �������� DI��뿡 ���� ������ ���� ������ ���� �� �ֽ��ϴ�. �Ǵ� DI�� ����ϴ� ���� �����ϰ� �ÁA�� �� ���� �ҿ�ȴٰ� ���� �� �� �ֽ��ϴ�.
//��� ���� �Ը��� ������Ʈ������ �������� DI����� �ϴ� �� ���� �Ϲ����� ����� ����Ͽ� �����ϴ� ���� ���� ������, ���߿� ���� ��Ʈ������ ���� �� �ֽ��ϴ�. 
//������ �Ը� ��� ���� Ŀ����, ���� �������� ������ �߻��ÿ��� DI�� �̿��� ������ ������ ���� �� �ֽ��ϴ�

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
