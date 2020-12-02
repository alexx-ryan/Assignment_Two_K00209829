/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexander
 */
@Entity
@Table(name = "vehicles_public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VehiclesPublic.findAll", query = "SELECT v FROM VehiclesPublic v"),
    @NamedQuery(name = "VehiclesPublic.findById", query = "SELECT v FROM VehiclesPublic v WHERE v.id = :id"),
    @NamedQuery(name = "VehiclesPublic.findByListingNumber", query = "SELECT v FROM VehiclesPublic v WHERE v.listingNumber = :listingNumber"),
    @NamedQuery(name = "VehiclesPublic.findByYear", query = "SELECT v FROM VehiclesPublic v WHERE v.year = :year"),
    @NamedQuery(name = "VehiclesPublic.findByReg", query = "SELECT v FROM VehiclesPublic v WHERE v.reg = :reg"),
    @NamedQuery(name = "VehiclesPublic.findByMake", query = "SELECT v FROM VehiclesPublic v WHERE v.make = :make"),
    @NamedQuery(name = "VehiclesPublic.findByModel", query = "SELECT v FROM VehiclesPublic v WHERE v.model = :model"),
    @NamedQuery(name = "VehiclesPublic.findByColour", query = "SELECT v FROM VehiclesPublic v WHERE v.colour = :colour"),
    @NamedQuery(name = "VehiclesPublic.findByListPrice", query = "SELECT v FROM VehiclesPublic v WHERE v.listPrice = :listPrice"),
    @NamedQuery(name = "VehiclesPublic.findByOdometerKPH", query = "SELECT v FROM VehiclesPublic v WHERE v.odometerKPH = :odometerKPH"),
    @NamedQuery(name = "VehiclesPublic.findByColumn062kph", query = "SELECT v FROM VehiclesPublic v WHERE v.column062kph = :column062kph"),
    @NamedQuery(name = "VehiclesPublic.findByEngine", query = "SELECT v FROM VehiclesPublic v WHERE v.engine = :engine"),
    @NamedQuery(name = "VehiclesPublic.findByFuel", query = "SELECT v FROM VehiclesPublic v WHERE v.fuel = :fuel"),
    @NamedQuery(name = "VehiclesPublic.findByTransmission", query = "SELECT v FROM VehiclesPublic v WHERE v.transmission = :transmission"),
    @NamedQuery(name = "VehiclesPublic.findByBody", query = "SELECT v FROM VehiclesPublic v WHERE v.body = :body"),
    @NamedQuery(name = "VehiclesPublic.findByIsofix", query = "SELECT v FROM VehiclesPublic v WHERE v.isofix = :isofix"),
    @NamedQuery(name = "VehiclesPublic.findByMotorTax", query = "SELECT v FROM VehiclesPublic v WHERE v.motorTax = :motorTax"),
    @NamedQuery(name = "VehiclesPublic.findByFullServiceHistory", query = "SELECT v FROM VehiclesPublic v WHERE v.fullServiceHistory = :fullServiceHistory"),
    @NamedQuery(name = "VehiclesPublic.findByPreviousOwners", query = "SELECT v FROM VehiclesPublic v WHERE v.previousOwners = :previousOwners"),
    @NamedQuery(name = "VehiclesPublic.findByDescription", query = "SELECT v FROM VehiclesPublic v WHERE v.description = :description"),
    @NamedQuery(name = "VehiclesPublic.findBySalesPerson", query = "SELECT v FROM VehiclesPublic v WHERE v.salesPerson = :salesPerson"),
    @NamedQuery(name = "VehiclesPublic.findBySalesPersonPhone", query = "SELECT v FROM VehiclesPublic v WHERE v.salesPersonPhone = :salesPersonPhone"),
    @NamedQuery(name = "VehiclesPublic.findBySalesPersonEmail", query = "SELECT v FROM VehiclesPublic v WHERE v.salesPersonEmail = :salesPersonEmail"),
    @NamedQuery(name = "VehiclesPublic.findBySalesPersonFax", query = "SELECT v FROM VehiclesPublic v WHERE v.salesPersonFax = :salesPersonFax")})

public class VehiclesPublic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "Listing_Number")
    private String listingNumber;
    @Size(max = 10)
    @Column(name = "Year")
    private String year;
    @Size(max = 12)
    @Column(name = "Reg")
    private String reg;
    @Size(max = 13)
    @Column(name = "Make")
    private String make;
    @Size(max = 40)
    @Column(name = "Model")
    private String model;
    @Size(max = 19)
    @Column(name = "Colour")
    private String colour;
    @Column(name = "List_Price")
    private Integer listPrice;
    @Column(name = "Odometer_KPH")
    private Integer odometerKPH;
    @Size(max = 18)
    @Column(name = "Column_0_62_kph")
    private String column062kph;
    @Size(max = 4)
    @Column(name = "Engine")
    private String engine;
    @Size(max = 8)
    @Column(name = "Fuel")
    private String fuel;
    @Size(max = 9)
    @Column(name = "Transmission")
    private String transmission;
    @Size(max = 11)
    @Column(name = "Body")
    private String body;
    @Size(max = 3)
    @Column(name = "Isofix")
    private String isofix;
    @Size(max = 4)
    @Column(name = "Motor_Tax")
    private String motorTax;
    @Size(max = 4)
    @Column(name = "Full_Service_History")
    private String fullServiceHistory;
    @Column(name = "Previous_Owners")
    private Integer previousOwners;
    @Size(max = 1012)
    @Column(name = "Description")
    private String description;
    @Size(max = 14)
    @Column(name = "Sales_Person")
    private String salesPerson;
    @Size(max = 10)
    @Column(name = "Sales_Person_Phone")
    private String salesPersonPhone;
    @Size(max = 31)
    @Column(name = "Sales_Person_Email")
    private String salesPersonEmail;
    @Size(max = 10)
    @Column(name = "Sales_Person_Fax")
    private String salesPersonFax;

    public VehiclesPublic() {
    }

    public VehiclesPublic(Integer id) {
        this.id = id;
    }
    
    public VehiclesPublic (int id, String listingnumber, String year, String reg, String make, String model, String colour, int listprice, int odometer, String tosixty, String engine, String fuel, String transmission, String body, String isofix, String motortax, String fullservicehistory, int previousowners, String description, String salesperson, String salespersonphone, String salespersonemail, String salespersonfax){
        this.id = id;
        this.listingNumber = listingnumber;
        this.year = year;
        this.reg = reg;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.listPrice = listprice;
        this.odometerKPH = odometer;
        this.column062kph = tosixty;
        this.engine = engine;
        this.fuel = fuel;
        this.transmission = transmission;
        this.body = body;
        this.isofix = isofix;
        this.motorTax = motortax;
        this.fullServiceHistory = fullservicehistory;
        this.previousOwners = previousowners;
        this.description = description;
        this.salesPerson = salesperson;
        this.salesPersonPhone = salespersonphone;
        this.salesPersonEmail = salespersonemail;
        this.salesPersonFax = salespersonfax;
    } 
    
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getListingNumber() {
        return listingNumber;
    }

    public void setListingNumber(String listingNumber) {
        this.listingNumber = listingNumber;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getOdometerKPH() {
        return odometerKPH;
    }

    public void setOdometerKPH(Integer odometerKPH) {
        this.odometerKPH = odometerKPH;
    }

    public String getColumn062kph() {
        return column062kph;
    }

    public void setColumn062kph(String column062kph) {
        this.column062kph = column062kph;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getIsofix() {
        return isofix;
    }

    public void setIsofix(String isofix) {
        this.isofix = isofix;
    }

    public String getMotorTax() {
        return motorTax;
    }

    public void setMotorTax(String motorTax) {
        this.motorTax = motorTax;
    }

    public String getFullServiceHistory() {
        return fullServiceHistory;
    }

    public void setFullServiceHistory(String fullServiceHistory) {
        this.fullServiceHistory = fullServiceHistory;
    }

    public Integer getPreviousOwners() {
        return previousOwners;
    }

    public void setPreviousOwners(Integer previousOwners) {
        this.previousOwners = previousOwners;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getSalesPersonPhone() {
        return salesPersonPhone;
    }

    public void setSalesPersonPhone(String salesPersonPhone) {
        this.salesPersonPhone = salesPersonPhone;
    }

    public String getSalesPersonEmail() {
        return salesPersonEmail;
    }

    public void setSalesPersonEmail(String salesPersonEmail) {
        this.salesPersonEmail = salesPersonEmail;
    }

    public String getSalesPersonFax() {
        return salesPersonFax;
    }

    public void setSalesPersonFax(String salesPersonFax) {
        this.salesPersonFax = salesPersonFax;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiclesPublic)) {
            return false;
        }
        VehiclesPublic other = (VehiclesPublic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.VehiclesPublic[ id=" + id + " ]";
    }
    
}
