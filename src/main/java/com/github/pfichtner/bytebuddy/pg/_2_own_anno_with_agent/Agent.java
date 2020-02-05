package com.github.pfichtner.bytebuddy.pg._2_own_anno_with_agent;

import static net.bytebuddy.matcher.ElementMatchers.any;
import static net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith;

import java.lang.instrument.Instrumentation;

import com.github.pfichtner.bytebuddy.pg.agent.Constructor;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;

public class Agent {

	public static void premain(String arguments, Instrumentation instrumentation) {
		new AgentBuilder.Default().with(new AgentBuilder.InitializationStrategy.SelfInjection.Eager()) //
				.type(isAnnotatedWith(Validate.class)) //
				.transform((builder, typeDescription, classLoader, module) -> builder //
						.constructor(any()).intercept(Advice.to(Constructor.class)))
				.installOn(instrumentation);
	}

}
