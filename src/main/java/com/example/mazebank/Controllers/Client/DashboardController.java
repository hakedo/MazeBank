package com.example.mazebank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public Text user_name;
    public Label login_date;
    public Label checking_balance_lbl;
    public Label checking_acc_num_lbl;
    public Label savings_balance_lbl;
    public Label savings_acc_num_lbl;
    public Label income_amount_lbl;
    public Label expense_amount_lbl;
    public ListView transaction_listview;
    public TextField payee_address_fld;
    public TextField send_money_amount_fld;
    public TextArea send_money_message_fld;
    public Button send_money_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
