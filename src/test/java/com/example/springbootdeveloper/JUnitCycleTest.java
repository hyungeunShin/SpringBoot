package com.example.springbootdeveloper;

import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    //전체 테스트 시작 전 처음으로 한번 실행
    //전체 테스트 실행주기에서 한번만 실행되야 하므로 static ==> O
    //ex) 데이터베이스를 연결하거나 테스트 환경을 초기화 할 때
    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    //테스트 케이스를 시작하기 전에 매번 실행
    //각 인스턴스에 대해 메소드를 호출해야 하므로 static ==> X
    //ex) 테스트 메소드에서 사용하는 객체를 초기화하거나 테스트에 필요한 값을 미리 넣을때
    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    //전체 테스트를 마치고 종료하기 전에 한 번만 실행
    //전체 테스트 실행 주기에서 한번만 호출되야 하므로 static ==> O
    //ex) 데이터베이스 연결 종료, 공통자원 해제
    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    //각 테스트를 종료하기 전 매번 실행
    //ex) 테스트 이후에 특정 데이터 삭제
    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }
}
