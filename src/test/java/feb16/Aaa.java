package feb16;

import org.testng.annotations.Test;

public class Aaa {

 String[] aaa = { "35", "45" };

 @Test
 public void a() {

  System.out.println(getValueByIndex(1));
 } 

 public String getValueByIndex(int index) {

  return aaa[index];
 }
}