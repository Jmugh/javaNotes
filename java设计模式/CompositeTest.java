/*
���ģʽ��Composite��
���ģʽ��ʱ�ֽв���-����ģʽ�ڴ����������νṹ������ʱ�ȽϷ���
*/
import java.util.*;
class TreeNode {  
      
    private String name;  
    private TreeNode parent;  
    private Vector<TreeNode> children = new Vector<TreeNode>();  
      
    public TreeNode(String name){  
        this.name = name;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public TreeNode getParent() {  
        return parent;  
    }  
  
    public void setParent(TreeNode parent) {  
        this.parent = parent;  
    }  
      
    //��Ӻ��ӽڵ�  
    public void add(TreeNode node){  
        children.add(node);  
    }  
      
    //ɾ�����ӽڵ�  
    public void remove(TreeNode node){  
        children.remove(node);  
    }  
      
    //ȡ�ú��ӽڵ�  
    public Enumeration<TreeNode> getChildren(){  
        return children.elements();  
    }  
}  

public class CompositeTest {  
  
    TreeNode root = null;  
  
    public CompositeTest(String name) {  
        root = new TreeNode(name);  
    }  
  
    public static void main(String[] args) {  
        CompositeTest tree = new CompositeTest("A");  
        TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC = new TreeNode("C");  
          
        nodeB.add(nodeC);  
		CompositeTest.root.add(nodeB);  
        System.out.println("build the tree finished!");  
    }  
}  