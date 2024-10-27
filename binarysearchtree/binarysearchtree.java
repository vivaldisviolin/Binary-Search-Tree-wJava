package binarysearchtree;

public class binarysearchtree  {
    private node root;

    public binarysearchtree(){
        this.root = null;
    }
    public void insert(int data){
        node node = new node(data); 
        if (root == null){
            root = node;
        }else{
            insertelement(data);
        }
    }

    public void insertelement(int data){
        node node = new node(data);
        node temp = root;
        while (true){
            if (data < temp.data){
                if (temp.left == null){
                    temp.left = node;
                    break;
                }else{
                    temp = temp.left;
                }
            }else{
                if (temp.right == null){
                    temp.right = node;
                    break;
                }else{
                    temp = temp.right;
                }
            }
        }
    }

    public void remove(int data){
        if (root == null){
            System.out.println("Tree is already empty !!!");
        }else{
            removeelement(data);
        }
    }

    public void removeelement(int data){
        node temp = root;
        while (true){
            if (temp.data == data){
                root = null;
                break;
            }else if(data < temp.data){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
    }

    public int countgeneration(){
        node temp = root;
        int generation_number = 1;
        while (true) { 
            if (root == null){
                return 0;
            }else if(temp.left == null && temp.right == null){
                return generation_number;
            }else{
                generation_number++;
                if(temp.left != null){
                    temp = temp.left;
                }else{
                    temp = temp.right;
                }
            }

        } 
    }
}