package kuke.kuke_board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KukeBoardApplication {

	public static void main(String[] args) {
		System.out.println("hyunsok 게시판 만들기 start !!");
		SpringApplication.run(KukeBoardApplication.class, args);
	}

}
