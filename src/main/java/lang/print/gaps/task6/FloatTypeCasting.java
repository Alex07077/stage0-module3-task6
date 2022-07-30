package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float i = (numberToBeRounded - ((int)numberToBeRounded));
            if (i > 0.499999){
                System.out.println((int)numberToBeRounded + 1);
            }else{
                System.out.println((int)numberToBeRounded);
            }
    }
}
