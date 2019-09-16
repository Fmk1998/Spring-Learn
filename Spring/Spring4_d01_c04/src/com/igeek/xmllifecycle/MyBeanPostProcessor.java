package com.igeek.xmllifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	//��ʼ��ʱ��֮ǰ�����õ�
	//����1��bean���󣬲���2��bean�����֣�id��name
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println(beanName+"�ڳ�ʼ��ǰ��ʼ��ǿ��");
		//���ֻ��ǿһ��bean
		if(beanName.equals("lifeCycleBean")){
			System.out.println(beanName+"�ڳ�ʼ����ʼ��ǿ��");
		}
		return bean;//����
	}

	//��ʼ��ʱ��֮�󣩵���
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println(beanName+"�ڳ�ʼ����ʼ��ǿ��");
		if(beanName.equals("lifeCycleBean")){
			System.out.println(beanName+"�ڳ�ʼ��ǰ��ʼ��ǿ��");
		}
		return bean;
	}

}