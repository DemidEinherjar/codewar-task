package tasks;

public class Test {
    public static void main(String[] args) {
//        testTriangleTester();
//        testBouncingBall();
//        fakeBinary();
//        testSequence();
//        testKata();
//        testSolution();
//        testKataReverse();
//        testStringToNumber();
//        testHelloName();
//        testRepeaterStr();
//        testTenMinWalk();
    }
    public static void testTriangleTester(){
        TriangleTester triangleTester = new TriangleTester();
        System.out.println(triangleTester.isTriangle(6, 5, 3));
    }
    public static void testBouncingBall(){
        BouncingBall bouncingBall = new BouncingBall();
        System.out.println(bouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
    public static void fakeBinary(){
        FakeBinary fakeBinary = new FakeBinary();
        String str = "366058562030849490134388085";
        System.out.println(fakeBinary.fakeBin(str));
    }
    public static void testSequence(){
        Sequence sequence = new Sequence();
        System.out.println(sequence.reverse(5));
    }
    public static void testKata(){
        Kata kata = new Kata();
        System.out.println(kata.solution("demid", "bid"));
    }
    public static void testSolution(){
        Solution solution = new Solution();
        System.out.println(solution.check(new Object[] {88, 66}, 66));
    }
    public static void testKataReverse(){
        KataReverse kataReverse = new KataReverse();
        System.out.println(kataReverse.reverseWords("        "));
    }
    public static void testStringToNumber(){
        System.out.println(new StringToNumber().stringToNumber("678"));
    }
    public static void testHelloName() { System.out.println(new HelloName().greet(new String("Demid")));}
    public static void testRepeaterStr(){ System.out.println((new RepeaterStr().repeaterStr(7, new String("Demid"))));}
    public static void testTenMinWalk(){System.out.println(new TenMinWalk().isValid(new char[]{'w', 'e', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'}));}
}
