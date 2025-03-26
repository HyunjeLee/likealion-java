package ch3.sec5_inherited;

// builder pattern ...
// 객체 생성 시점에 직접 생성하지 않고
// 객체 생성 대행자(builder)를 이용해 생성하는 패턴

// 언제? 객체 생성 작업이 너무 복잡할 때!

// 예시
// 이용 클래스는 Bitmap (이미지) // 당연히 복잡하겠지..?
// Bitmap 객체를 직접 생성하지 않고 Builder를 이용해서 생성하자!

import ch3.sec5_inherited.Bitmap.Bitmap;
import ch3.sec5_inherited.Bitmap.Builder;

public class BitmapExam {
    public static void main(String[] args) {
//        Bitmap bitmap = new Bitmap();//error
        Builder builder = new Builder();
        Bitmap bitmap = builder.createBitmap();
        Bitmap bitmap1 = builder.createBitmap();
    }
}
