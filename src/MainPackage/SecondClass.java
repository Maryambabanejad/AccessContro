package MainPackage;
public class SecondClass {
    int number = 123;
  //private void testMethod() {
      // متد بصورت private بوده و قابل دیدن در کلاس مختلف همان پکیچ نمی باشد و SyntaxError میدهد
    void testMethod() {
        //متد بصورت package acceses استفاده شده تا در دو کلاس مختلف یک پکیچ قابل اجرا باشد
        System.out.println(number);
    }
}
