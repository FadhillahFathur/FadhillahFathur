import java.util.Scanner;
public class soal3
{
	public static void main (String arg[])
	{
		Scanner masuk=new Scanner(System.in);
		int harga ;
		System.out.println("Biaya Angsuran Per Bulan");
		System.out.println("===========================");
		System.out.print("Masukkan Harga Laptop : ");
		harga=masuk.nextInt();
		if(harga>=15000000)
		{
			String angs ;
			float angs6,angs12; ;
			System.out.println("Masukkan Pilihan Angsuran 6 bulan atau 12 bulan :");
			angs=masuk.nextLine();
			{
				if (angs==6)
				angs6=0.01f*harga;
				System.out.println("Biaya Angsuran Per Bulan = "& angs6);
				{
				if (angs==12);
				angs12=0.02*harga;
				System.out.println("Biaya Angsuran Per Bulan = "& angs12);
				}
			}
		}
		else if (harga>=8000000)
		{
			String angs;
			float angs6,angs12;
			System.out.println("Masukkan Pilihan Angsuran 6 bulan atau 12 bulan :");
			angs=masuk.nextLine();
			{
				if (angs==6)
				angs6=0.01f*harga;
				System.out.println("Biaya Angsuran Per Bulan = "& angs6);
				{
				if (angs==12);
				System.out.println("Tidak boleh di angsur"& angs12);
				}
			}
		}
		else if (harga<8000000)
		{
			System.out.println("Tidak bisa Angsuran harus CASH ");
		}
	}
}
