package com.lmy.pojo;

public class Quote {
	private int id;
	private String cn;
	private String en;
	private String pic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Quote(int id, String cn, String en, String pic) {
		super();
		this.id = id;
		this.cn = cn;
		this.en = en;
		this.pic = pic;
	}

	public Quote() {
		super();
	}

	@Override
	public String toString() {
		return "Quote [id=" + id + ", cn=" + cn + ", en=" + en + ", pic=" + pic
				+ "]";
	}

}
