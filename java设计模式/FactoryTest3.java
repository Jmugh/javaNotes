interface Sender {//��̬��������ģʽ������Ķ����������ģʽ��ķ�����Ϊ��̬�ģ�
				  //����Ҫ����ʵ����ֱ�ӵ��ü���
    public void Send();  
}  
class MailSender implements Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
}  
class SmsSender implements Sender {  
  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
} 
class SendFactory {  
      
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}  

public class FactoryTest3 {  
  
    public static void main(String[] args) {      
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
    }  
}

/*
������˵������ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ��
����ͨ����������ģʽ���д����������ϵ�����ģʽ�У���һ�����������ַ�������
������ȷ�������󣬵���������ڵڶ��֣�����Ҫʵ���������࣬
���ԣ����������£����ǻ�ѡ�õ����֡�����̬��������ģʽ��
*/