package OOP;

public class BaiTap2 {
    int chieuDai;
    int chieuRong;

    public void inputChieuDai (int chieuDai){
        this.chieuDai = chieuDai;
            }
    public int getChieuDai (){
        return chieuDai;
    }
    public void inputChieuRong (int chieuRong){
        this.chieuRong = chieuRong;
    }
    public int getChieuRong (){
        return chieuRong;
    }
    public int getDienTich (){
        int dienTich = chieuDai *chieuRong;
        return dienTich;
    }
    public int  getChuvi (){
       int  chuVi = (chieuDai+ chieuRong)*2;
     return  chuVi;
    }
    public boolean Ve(){

        for(int i=1; i<=chieuDai; i++)
        {
            for(int j=1;j<=chieuRong;j++)

                if(i==1||j==1 ||i==chieuDai ||j==chieuRong)

                    System.out.print("*");
                else System.out.print("*");
            System.out.println();
        }
        return true;
    }

    }


