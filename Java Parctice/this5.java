class this5 {
     
    thi tha;
    
    this5(thi tha) {
        this.tha = tha;
    }
     
    void display() {
        System.out.println("Display method called "+tha.data);
    }

}

class thi {
    
    int data =10;
    thi(){
    this5 thu=new this5(this);
    thu.display();
    }

    public static void main(String[] args) {
        thi tha = new thi();
    }

}
