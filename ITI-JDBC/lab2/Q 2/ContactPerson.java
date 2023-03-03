/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbgui;
import java.sql.Date;
/**
 *
 * @author salmamabrouk
 */
public class ContactPerson {
    private int id;
    private String Name;
    private String NickName;
    private String Address;
    private String HomePhone;
    private String WorkPhone;
    private String CellPhone;
    private String Email;
    private Date Birthday;
    private String WebSite;
    private String Profession;
    public ContactPerson() {
        }
    

    public ContactPerson(int id, String Name, String NickName, String Address, String HomePhone, String WorkPhone, String CellPhone, String Email, Date Birthday, String WebSite, String Profession) {
        this.id = id;
        this.Name = Name;
        this.NickName = NickName;
        this.Address = Address;
        this.HomePhone = HomePhone;
        this.WorkPhone = WorkPhone;
        this.CellPhone = CellPhone;
        this.Email = Email;
        this.Birthday = Birthday;
        this.WebSite = WebSite;
        this.Profession = Profession;
    }

 
    
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.Name=name;
    }
     public void setNickName(String nickname)
    {
        this.NickName=nickname;
    }
      public void setAddress(String ad)
    {
        this.Address=ad;
    }
    
    public void setHomePhone(String hp)
    {
        this.HomePhone=hp;
    }
    public void setWorkPhone(String wp)
    {
        this.WorkPhone=wp;
    }
    public void setCellPhone(String cp)
    {
        this.CellPhone=cp;
    }
    public void setEmail(String email)
    {
        this.Email=email;
    }
    public void setBD(Date bd)
    {
        this.Birthday=bd;
    }
     public void setWebSite(String ws)
    {
        this.WebSite=ws;
    }
    public void setProfession(String prof)
    {
        this.Profession=prof;
    }
   
   
    ////////////////////////////////
    //id, name, nick_name, address, home_phone, work_phone, cell_phone, email, birthday, web_site, profession
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return Name;
    }
    public String getNickName()
    {
        return NickName;
    }
     public String getAddress()
    {
        return Address;
    }
    public String getHomePhone()
    {
        return HomePhone;
    }
     public String getWorkPhone()
    {
        return WorkPhone;
    }
      public String getCellPhone()
    {
        return CellPhone;
    }
    public String getEmail()
    {
        return Email;
    }
       public Date getBD()
    {
        return Birthday;
    }
    
    public String getWebsite()
    {
        return WebSite;
    }
 
      public String getProfession()
    {
        return Profession;
    }
}