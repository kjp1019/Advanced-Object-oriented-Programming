package hw1_1;

//***************************

//파일명: Point.java

//작성자: 김진필

//작성일: 2025-09-24

//내용: Resettable 인터페이스 구현

//***************************

public class Point implements Resettable{
	private double x;
	private double y;
	
	//초기 좌표
	private final double initialX;
	private final double initialY;
	
	//초기 설정
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		
		this.initialX = x;
		this.initialY = y;
	}

	// 이동 (dx, dy)만큼
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getX() { 
    	return x;
    }
    public double getY() { 
    	return y; 
    }

    // 초기 좌표로 복원
    @Override
    public void reset() {
        this.x = initialX;
        this.y = initialY;
    }

    // 좌표만 보이도록 출력 (소수점 한 자리)
    @Override
    public String toString() {
        return String.format("x=%.1f, y=%.1f", x, y);
    }
}
