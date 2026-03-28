public class KoreanOutletAdapter implements Charger { 
    // 인터페이스 Charger를 구현하는 어댑터 클래스

    private KoreanOutlet outlet; // 내부에 포함
    // KoreanOutlet 객체를 참조 
    // 어댑터는 Charger 인터페이스를 구현하면서 KoreanOutlet의 기능을 활용

    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public int charge() {
        // provide()를 charge()로 변환
        int voltage = outlet.provide();
        return voltage; // 그대로 220V 반환
    }
}
