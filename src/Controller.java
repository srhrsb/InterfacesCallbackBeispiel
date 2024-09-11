public class Controller {

    public Controller() {
       sum( 10, 15, this::showResult);
    }

    public void sum( int v1, int v2, Action<Integer, String> callback){
        int resultInt = v1 + v2;
        String resultString = Integer.toString( resultInt);
        callback.invoke( resultInt, resultString);
    }

    private void showResult(int number, String text){
        System.out.println(number);
        System.out.println(text);
    }
}
