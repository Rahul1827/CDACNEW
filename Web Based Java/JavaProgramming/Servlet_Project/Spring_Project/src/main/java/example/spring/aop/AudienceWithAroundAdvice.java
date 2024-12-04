package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceWithAroundAdvice {

	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {

	}

	private void takeSeats() {

		System.out.println("Please take your seat: around");
	}

	private void turnOffMobile() {

		System.out.println("Please turn of your  mobile: around");
	}

	private void clap() {

		System.out.println("Clap Clap Clap: around");
	}

	private void demandForRefund() {

		System.out.println("Please give my money back: around");
	}

	private void leave() {

		System.out.println("Bye , leaving now: around");
	}
   @Around("myPointCut()")
	private void monitorPerformance(ProceedingJoinPoint joinPoint) {

		try {

			takeSeats();
			turnOffMobile();
			joinPoint.proceed();
			clap();
		} catch (Throwable e) {
			demandForRefund();

			e.printStackTrace();
		} // unable to proceed towards target

		leave();
	}

}
