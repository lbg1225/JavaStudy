# 학습목표

- 인터페이스 개념을 이해한다.
	* 사전적 의미 : 키보드나 디스플레이 따위처럼 사람과 컴퓨터를 연결하는 장치
	* Java에서의 의미
		- 기능에 대한 선언과 구현의 분리
		- 기능을 사용하는 통로
- 델리게이트 개념을 이행한다.
	* 사전적 의미 : 위임한다.
	* Java에서의 의미 
		- 필요한 기능을 다른 Class에 개발하도록 요청하여 사용.
		- 기능의 구현을 다른객체에 위임하고 구현된 기능을 빌려서 사용하는 것.
		- 특정 객체의 기능을 사용하기 위해 다른 객체의 기능을 호출하는 것.
		
- 전략패턴의 개녕을 이해한다.
	* 여러 알고리즘을 하나의 추상적인 접근점(Inte을 만들고
	* 접근 점에서 서로 교환 가능하도록 하는 패턴
	
![2021_04_user_count](strategy.png)	

# 요구사항
- 신작게임에서 케릭터와 무기를 구현해보세요.
- 무기는 두가지 종류가 있습니다.
	* 칼
	* 검
