import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class personalDetails extends JFrame{
    private JLabel name;
    private JTextField Nametf;
    private JTextField Emailtf;
    private JTextField Teletf;
    private JTextField Postaltf;
    private JTextField Addresstf;
    private JLabel surname;
    private JLabel addressLabel;
    private JLabel postalCodeLabel;
    private JLabel telephoneNoLabel;
    private JLabel emailLabel;
    private JTextField surnameTf;
    private JLabel heading;
    private JLabel departurePointLabel;
    private JLabel destinationLabel;
    private JLabel accomodatioLabel;
    private JComboBox departureList;
    private JComboBox destinationDropdown;
    private JComboBox accomoDropdown;
    private JPanel MainPanel;
    private JLabel flightLabel;
    private JLabel ticketLabel;
    private JLabel adultLabel;
    private JLabel childLabel;
    private JRadioButton standardRadioButton;
    private JRadioButton economyRadioButton;
    private JRadioButton firstClassRadioButton;
    private JRadioButton singleRadioButton;
    private JRadioButton returnRadioButton;
    private JRadioButton adultRadioButton;
    private JRadioButton childRadioButton;
    private JRadioButton airportTaxPaidRadioButton;
    private JRadioButton travellingInsurancePaidRadioButton;
    private JRadioButton airMilesOver20000RadioButton;
    private JRadioButton extLuggageRadioButton;
    private JLabel taxLabel;
    private JLabel totalLabel;
    private JTextField subTotaltf;
    private JLabel subTotalLabel;
    private JTextField Taxtf;
    private JTextField totaltf;
    private JButton totalButton;
    private JButton resetButton;
    private JTextArea Receipt;
    private JButton receiptButton;
    private JButton exitButton;
    private JLabel recieptLabel;
    private JPanel detailsPanel;
    private JPanel receiptPanel;
    private JPanel flightDetailsPanel;
    private JPanel billingPanel;
    private JPanel headingPanel;
    private JFrame exitFrame;
    public personalDetails(){
        setVisible(true);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    exitFrame = new JFrame("Exit");
                    if(JOptionPane.showConfirmDialog(exitFrame,"Confirm if you want to exit","Travel Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                        System.exit(0);
                    }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nametf.setText(null);
                surnameTf.setText(null);
                totaltf.setText(null);
                subTotaltf.setText(null);
                Emailtf.setText(null);
                Postaltf.setText(null);
                Addresstf.setText(null);
                Taxtf.setText(null);
                Teletf.setText(null);
                departureList.setSelectedItem("None");
                destinationDropdown.setSelectedItem("None");
                accomoDropdown.setSelectedItem("None");
                airMilesOver20000RadioButton.setSelected(false);
                airportTaxPaidRadioButton.setSelected(false);
                extLuggageRadioButton.setSelected(false);
                travellingInsurancePaidRadioButton.setSelected(false);
                standardRadioButton.setSelected(false);
                economyRadioButton.setSelected(false);
                firstClassRadioButton.setSelected(false);
                singleRadioButton.setSelected(false);
                returnRadioButton.setSelected(false);
                adultRadioButton.setSelected(false);
                childRadioButton.setSelected(false);
            }
        });
        totalButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                double M_NYC = 60000;
                double M_WDC = 55000;
                double M_LDN = 50000;
                double M_SYD = 52500;
                double M_MEL = 53000;
                double M_BRB = 52750;
                double M_BRS = 33000;
                double M_AMS = 35000;
                double M_PAR = 37000;
                double K_NYC = 62000;
                double K_WDC = 57000;
                double K_LDN = 52000;
                double K_SYD = 54500;
                double K_MEL = 55000;
                double K_BRB = 54750;
                double K_BRS = 35000;
                double K_AMS = 37000;
                double K_PAR = 39000;
                double D_NYC = 61000;
                double D_WDC = 56000;
                double D_LDN = 51000;
                double D_SYD = 53500;
                double D_MEL = 54000;
                double D_BRB = 55750;
                double D_BRS = 34000;
                double D_AMS = 36000;
                double D_PAR = 38000;
                double G_NYC = 60500;
                double G_WDC = 55500;
                double G_LDN = 50500;
                double G_SYD = 53000;
                double G_MEL = 52000;
                double G_BRB = 53250;
                double G_BRS = 33500;
                double G_AMS = 35500;
                double G_PAR = 37500;
                double B_NYC = 62000;
                double B_WDC = 57000;
                double B_LDN = 52000;
                double B_SYD = 54500;
                double B_MEL = 55000;
                double B_BRB = 54750;
                double B_BRS = 35000;
                double B_AMS = 37000;
                double B_PAR = 39000;
                double C_NYC = 63000;
                double C_WDC = 58000;
                double C_LDN = 53000;
                double C_SYD = 55500;
                double C_MEL = 56000;
                double C_BRB = 55750;
                double C_BRS = 36000;
                double C_AMS = 38000;
                double C_PAR = 40000;
                double extLug = 5000;
                double airportTax = 0.05;
                double airMiles = 0.2;
                double travelInsurance = 600;
                double standardFlight = 1.25;
                double economyFlight = 1;
                double firstClass = 1.75;
                double adult = 1;
                double child = 0.6;
                double tax = 5;
                double subtotal = 0;
                if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="Washington DC"){
                    subtotal += M_WDC;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="New York"){
                    subtotal += M_NYC;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="London"){
                    subtotal += M_LDN;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="Sydney"){
                    subtotal += M_SYD;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="Melbourne"){
                    subtotal += M_MEL;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="Brisbane"){
                    subtotal += M_BRB;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="Brussels"){
                    subtotal += M_BRS;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="Amsterdam"){
                    subtotal += M_AMS;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                else if(departureList.getSelectedItem() == "Mumbai" && destinationDropdown.getSelectedItem()=="Paris"){
                    subtotal += M_PAR;
                    if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                    if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                    if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                    if(childRadioButton.isSelected()) subtotal = subtotal*child;
                    if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                    if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                    if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                    if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                    if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                    if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                    if(returnRadioButton.isSelected())subtotal = subtotal*2;
                    subTotaltf.setText(String.format("₹%.2f",subtotal));
                    Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                    totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                }
                if(departureList.getSelectedItem() == "Kolkata"){
                    if(destinationDropdown.getSelectedItem()== "New York"){
                        subtotal += K_NYC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Washington DC"){
                        subtotal += K_WDC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "London"){
                        subtotal += K_LDN;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Sydney"){
                        subtotal += K_SYD;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Melbourne"){
                        subtotal += K_MEL;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brisbane"){
                        subtotal += K_BRB;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brussels"){
                        subtotal += K_BRS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Amsterdam"){
                        subtotal += K_AMS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Paris"){
                        subtotal += K_PAR;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                }
                if(departureList.getSelectedItem() == "Delhi"){
                    if(destinationDropdown.getSelectedItem()== "New York"){
                        subtotal += D_NYC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Washington DC"){
                        subtotal += D_WDC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "London"){
                        subtotal += D_LDN;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Sydney"){
                        subtotal += D_SYD;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Melbourne"){
                        subtotal += D_MEL;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brisbane"){
                        subtotal += D_BRB;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brussels"){
                        subtotal += D_BRS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Amsterdam"){
                        subtotal += D_AMS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Paris"){
                        subtotal += D_PAR;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                }
                if(departureList.getSelectedItem() == "Goa"){
                    if(destinationDropdown.getSelectedItem()== "New York"){
                        subtotal += G_NYC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Washington DC"){
                        subtotal += G_WDC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "London"){
                        subtotal += G_LDN;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Sydney"){
                        subtotal += G_SYD;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Melbourne"){
                        subtotal += G_MEL;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brisbane"){
                        subtotal += G_BRB;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brussels"){
                        subtotal += G_BRS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Amsterdam"){
                        subtotal += G_AMS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Paris"){
                        subtotal += G_PAR;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                }
                if(departureList.getSelectedItem() == "Bangalore"){
                    if(destinationDropdown.getSelectedItem()== "New York"){
                        subtotal += B_NYC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Washington DC"){
                        subtotal += B_WDC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "London"){
                        subtotal += B_LDN;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Sydney"){
                        subtotal += B_SYD;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Melbourne"){
                        subtotal += B_MEL;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brisbane"){
                        subtotal += B_BRB;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brussels"){
                        subtotal += B_BRS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Amsterdam"){
                        subtotal += B_AMS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Paris"){
                        subtotal += B_PAR;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                }
                if(departureList.getSelectedItem() == "Chennai"){
                    if(destinationDropdown.getSelectedItem()== "New York"){
                        subtotal += C_NYC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Washington DC"){
                        subtotal += C_WDC;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "London"){
                        subtotal += C_LDN;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Sydney"){
                        subtotal += C_SYD;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Melbourne"){
                        subtotal += C_MEL;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brisbane"){
                        subtotal += C_BRB;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Brussels"){
                        subtotal += C_BRS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Amsterdam"){
                        subtotal += C_AMS;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                    else if(destinationDropdown.getSelectedItem()== "Paris"){
                        subtotal += C_PAR;
                        if(standardRadioButton.isSelected()) subtotal = subtotal*standardFlight;
                        if(economyRadioButton.isSelected())subtotal = subtotal*economyFlight;
                        if(firstClassRadioButton.isSelected())subtotal = subtotal*firstClass;
                        if(childRadioButton.isSelected()) subtotal = subtotal*child;
                        if(accomoDropdown.getSelectedItem() == "Double") subtotal = subtotal + subtotal*0.10;
                        if(accomoDropdown.getSelectedItem() == "Extra") subtotal = subtotal + subtotal*0.25;
                        if(!airportTaxPaidRadioButton.isSelected()) subtotal = subtotal + subtotal*airportTax;
                        if(airMilesOver20000RadioButton.isSelected()) subtotal = subtotal - subtotal*airMiles;
                        if(extLuggageRadioButton.isSelected()) subtotal += extLug;
                        if(!travellingInsurancePaidRadioButton.isSelected()) subtotal += travelInsurance;
                        if(returnRadioButton.isSelected())subtotal = subtotal*2;
                        subTotaltf.setText(String.format("₹%.2f",subtotal));
                        Taxtf.setText(String.format("₹%.2f",subtotal*0.05));
                        totaltf.setText(String.format("₹%.2f",subtotal+subtotal*0.05));
                    }
                }
            }
        });
        receiptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar timer = Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
                String iTime = (tTime.format(timer.getTime()));

                SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
                String iDate = (Tdate.format(timer.getTime()));

                int num1;
                String ref = "";
                num1 = 1325 + (int) (Math.random()*4276);
                ref += num1+1325;

                String firstName = Nametf.getText();
                String surName = surnameTf.getText();
                String address = Addresstf.getText();
                String postCode = Postaltf.getText();
                String telephone = Teletf.getText();
                String email = Emailtf.getText();
                String rtax = Taxtf.getText();
                String rsubtotal = subTotaltf.getText();
                String rtotal = totaltf.getText();

                Receipt.append("\t Travel Management System: \n\n "
                        +"Ref:\t\t\t"+ref
                        +"\n-------------------------------------"
                        +"\nName:\t\t\t"+firstName
                        +"\nSurname:\t\t\t"+surName
                        +"\nAddress:\t\t\t"+address
                        +"\nPostCode:\t\t\t"+postCode
                        +"\nTelephone:\t\t\t"+telephone
                        +"\nEmail:\t\t\t"+email
                        +"\nTax\t\t\t"+rtax
                        +"\n Sub Total:\t\t\t"+rsubtotal
                        +"\nTotal:\t\t\t"+rtotal
                        +"\n-------------------------------------"
                        +"\nDate: "+iDate+" \tTime: "+iTime
                        +"\n\n\tThanks for using \n\tTravel Management System"
                );
            }
        });
    }

    public static void main(String[] args) {
        personalDetails p = new personalDetails();
        p.setContentPane(p.MainPanel);
        p.setTitle("Travel Management");
        p.setSize(new Dimension(1800,2000));
        p.pack();
        p.setVisible(true);
    }

    private void createUIComponents() {
        detailsPanel = new JPanel();
        flightDetailsPanel = new JPanel();
        receiptPanel = new JPanel();
        billingPanel = new JPanel();
        headingPanel = new JPanel();
        LineBorder border = new LineBorder(Color.BLACK, 2);
        detailsPanel.setBorder(border);
        flightDetailsPanel.setBorder(border);
        receiptPanel.setBorder(border);
        billingPanel.setBorder(border);
        LineBorder headingBorder = new LineBorder(Color.BLACK, 20);
        headingPanel.setBorder(headingBorder);
        // TODO: place custom component creation code here
    }
}
