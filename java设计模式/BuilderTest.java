/*
������ģʽ��Builder��
������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й���
�����������϶�����ν���϶������ָĳ������в�ͬ�����ԣ�
��ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ��ġ�
*/

import java.util.*;

class Builder {  
      
    private List<Sender> list = new ArrayList<Sender>();  
      
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}  

public class BuilderTest{  
  
    public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceMailSender(10);  
    }  
}  