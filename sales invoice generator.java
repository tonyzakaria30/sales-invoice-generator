# sales-invoice-generator
Udacity fwd 1st project
public class Invoice extends javax.swing.JFrame 
{
public Invoice () 
{
    initComponents();
    InvoiceHeder();
}
private void InvoiceHeder()
{
txtInvoice.setText(+n
            +"Company Name+n
    +Contact No+n
    +Adres- enter Adress+n
    +n);
}
private void Button1(java.awt.event.ActionEvent evt) 
{

    txtInvoice.setText(
    txtIvoice.getText()+txtname.getText()+"-"+txtquentity.getText()+"tt"+txtprice.getText()+n
    );
    txtname.setText();
    txtquentity.setText();
    txtprice.setText();
}
private void Button2(java.awt.event.ActionEvent evt)
   {
        txtInvoice.setText(txtInvoice.getText()+n
    +Develop by: SynTech);
        txtInvoice.print();
    } 
    catch (Exception e) 
    {
    }
}

