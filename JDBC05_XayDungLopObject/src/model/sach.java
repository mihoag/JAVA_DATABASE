package model;

public class sach
{
	private String id;
	private String tensach;
	private float giaban;
	private int namXB;
	
	public sach()
	{
	}

	public sach(String id, String tensach, float giaban, int namXB) {
		this.id = id;
		this.tensach = tensach;
		this.giaban = giaban;
		this.namXB = namXB;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public float getGiaban() {
		return giaban;
	}

	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}

	public int getNamXB() {
		return namXB;
	}

	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}
}