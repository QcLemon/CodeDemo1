/**
 * author lqy
 * explication
 * date 2023/2/10
 **/
public class TestUtils {
    public Integer number = 0;

    public static void main(String[] args) {
        TestUtils testUtils = new TestUtils();
        testUtils.getNumber(10,0,0,0);
        System.out.println(testUtils.number);

    }

    public  void getNumber(int money,int beerBottle,int beerBottleCap,int thisN){
        if(beerBottle < 2 && beerBottleCap < 4 && money < 1){
            if(number < thisN){
                number = thisN;
            }
            return;
        }
        if(money >= 2){
            getNumber(money -2,beerBottle + 1,beerBottleCap + 1,thisN + 1);
        }
        if(beerBottle >= 2){
            getNumber(money,beerBottle -2 + 1, beerBottleCap + 1,thisN + 1);
        }
        if(beerBottleCap >= 4){
            getNumber(money,beerBottle  + 1, beerBottleCap - 4 + 1,thisN + 1);
        }
    }
}
