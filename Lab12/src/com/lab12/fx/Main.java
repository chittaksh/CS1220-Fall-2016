package com.lab12.fx;

import javafx.scene.control.TextField;
import com.lab12.classes.RecursiveProbs;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Application.launch(Main.class, args);
	}

	@Override
	public void start(Stage primaryStage) {

		final RecursiveProbs recurr = new RecursiveProbs();
		primaryStage.setTitle("String Management.");

		VBox vBox = new VBox();

		// Add Controls
		final HBox hboxInput = new HBox();
		final Label lblStringInput = new Label("Input String");
		lblStringInput.setPadding(new Insets(5, 10, 10, 10));
		final TextField txtInput = new TextField();
		// txtInput.setPadding(new Insets(10, 10, 10, 10));
		hboxInput.getChildren().addAll(lblStringInput, txtInput);
		vBox.getChildren().add(hboxInput);

		// Add Controls
		final HBox hboxInputChar = new HBox();
		final Label lblSearchChar = new Label("Search Char");
		lblSearchChar.setPadding(new Insets(5, 10, 10, 10));
		final TextField txtSearchInput = new TextField();
		// txtInput.setPadding(new Insets(10, 10, 10, 10));
		hboxInputChar.getChildren().addAll(lblSearchChar, txtSearchInput);
		vBox.getChildren().add(hboxInputChar);

		// Add Output Label
		final HBox hboxOutput = new HBox();
		final Label lblFinalValue = new Label();
		lblFinalValue.setPadding(new Insets(5, 10, 10, 10));
		hboxOutput.getChildren().add(lblFinalValue);
		vBox.getChildren().add(hboxOutput);

		// Add Output Label
		final HBox hboxButton = new HBox(10);
		// Label lblFinalValue = new Label();
		Button btnContains = new Button("Recursive Contains");
		btnContains.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if (validateString(txtInput.getText()) && validateChar(txtSearchInput.getText()) == 1) {
					if (recurr.recursiveContains(txtSearchInput.getText().charAt(0), txtInput.getText())) {

						lblFinalValue.setText("True");
						lblFinalValue.setTextFill(Color.GREEN);
					} else {
						lblFinalValue.setText("False");
						lblFinalValue.setTextFill(Color.BLUE);
					}
				} else if (!validateString(txtInput.getText())) {
					lblFinalValue.setText("Please enter the string.");
					lblFinalValue.setTextFill(Color.RED);
				} else if (validateChar(txtSearchInput.getText()) == 0) {
					lblFinalValue.setText("Please enter the char to search for.");
					lblFinalValue.setTextFill(Color.RED);
				} else {
					lblFinalValue.setText("Please enter only one char to search for.");
					lblFinalValue.setTextFill(Color.RED);
				}
			}
		});

		Button btnCharCount = new Button("Char Count");
		// btnCharCount.setPadding(new Insets(10, 10, 10, 10));
		btnCharCount.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if (validateString(txtInput.getText()) && validateChar(txtSearchInput.getText()) == 1) {
					lblFinalValue.setText(String
							.valueOf(recurr.recursiveCount(txtSearchInput.getText().charAt(0), txtInput.getText())));
					lblFinalValue.setTextFill(Color.GREEN);
				} else if (!validateString(txtInput.getText())) {
					lblFinalValue.setText("Please enter the string.");
					lblFinalValue.setTextFill(Color.RED);
				} else if (validateChar(txtSearchInput.getText()) == 0) {
					lblFinalValue.setText("Please enter the char to search for.");
					lblFinalValue.setTextFill(Color.RED);
				} else {
					lblFinalValue.setText("Please enter only one char to count on.");
					lblFinalValue.setTextFill(Color.RED);
				}
			}
		});

		Button btnSameChar = new Button("Same Characters");
		btnSameChar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if (validateString(txtInput.getText())) {
					if (recurr.recursiveAllCharactersSame(txtInput.getText())) {
						lblFinalValue.setText("True");
						lblFinalValue.setTextFill(Color.GREEN);
					} else {
						lblFinalValue.setText("False");
						lblFinalValue.setTextFill(Color.BLUE);
					}
				} else {
					lblFinalValue.setText("Please enter the string.");
					lblFinalValue.setTextFill(Color.RED);
				}
			}
		});

		Button btnReverse = new Button("Reverse String");
		btnReverse.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if (validateString(txtInput.getText())) {
					lblFinalValue.setText(recurr.recursiveReverse(txtInput.getText()));
					lblFinalValue.setTextFill(Color.GREEN);
				} else {
					lblFinalValue.setText("Please enter the string.");
					lblFinalValue.setTextFill(Color.RED);
				}
			}
		});

		hboxButton.getChildren().addAll(btnContains, btnCharCount, btnSameChar, btnReverse);
		// hboxButton.setPadding(new Insets(10, 10, 10, 10));
		vBox.getChildren().add(hboxButton);

		vBox.setPadding(new Insets(20, 20, 20, 20));
		final Scene scene = new Scene(vBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private boolean validateString(String str) {
		if (str.trim().length() > 0)
			return true;
		else
			return false;
	}

	private int validateChar(String str) {
		if (str.trim().length() == 1)
			return 1;
		else if (str.trim().length() < 2)
			return 0;
		else
			return -1;
	}

}