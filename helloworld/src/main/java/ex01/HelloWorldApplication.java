package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * Bootstrapping class
 * 
 * 1. 스프링부트 어플리케이션의 부트스트래핑(Bootstrapping)
 * 2. 설정 클래스로 역할(Configuration Class)
 * 
 */

@SpringBootApplication // 여기 
public class HelloWorldApplication {

	public static void main(String[] args) {
		/*
		 * 1. Application Context, Spring Container 생성
		 * 2. 웹 어플리케이션 타입 결정 (Web Application인 경우 MVC or Reactive type 결정)
		 * 3. 어노테이션 스캐닝(auto) or  Configuration Class(Explicit) 통한 빈 생성/등록 및 와이어링
		 * 4. 웹 어플리케이션 (MVC) 
		 * 	  - 내장(embeded) 서버(TomcatEmbededServletContainer) 인스턴스 생성
		 * 	  - 서버 인스턴스 웹어플리케이션을 배포
		 *    - 서버 인스턴스 실행
		 * 5. ApplicationRunner 인터페이스 구현한 Bean을 찾아서 실행(run 호출)
		 */
		
//		ConfigurableApplicationContext c = null;
//		try { // 안정적인 코드를 위한 try-catch 문
//			c = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			c.close();
//		}
		
		// try ~ with ~ resource ; catch 생략 가능
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)) {
			
		}
		// run이 컨테이너를 리턴
//		System.out.println("Hello World"); -> 바람직하지 못함. 실행 시키고 싶으면 저 인터페이스를 구현한 빈에 넣는게 낫다.
	}
}
