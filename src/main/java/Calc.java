public class Calc {
    public int sum(int var1, int var2){
        System.out.println("Action:" + var1 + "+" + var2);
        return var1 + var2;
    }

    public int sum(String var1, int var2){
        System.out.println("Action:" + var1 + " + " + var2);
        try {
            int result = Integer.parseInt(var1);
            return result + var2;
        } catch (Exception e) {
            System.out.println("возникла ошибка: " + e.getMessage());

        } finally {
            return -1;
        }
    }
}
