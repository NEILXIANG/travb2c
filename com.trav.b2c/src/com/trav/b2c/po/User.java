package com.trav.b2c.po;

import java.util.Date;
import java.util.List;

public class User extends UpdatableBean {
	private static final long serialVersionUID = 1L;

	private Date dateRegisted;
	private String userName;//�û���½���û���
	private String firstName;
	private String familyName;
	private String telephoneNo;
	private String mobileNo;
	private String houseNo;// ����
	private String street;// �ֵ�
	private String district;// ��
	private String municipality;// ��
	private String province;// ʡ
	private List<Addressee> addressees;// �ռ�����Ϣ,�����û��������ռ���
	private List<Order> orders;// �û�����

	public Date getDateRegisted() {
		return dateRegisted;
	}

	public void setDateRegisted(Date dateRegisted) {
		this.dateRegisted = dateRegisted;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public List<Addressee> getAddressees() {
		return addressees;
	}

	public void setAddressees(List<Addressee> addressees) {
		this.addressees = addressees;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
