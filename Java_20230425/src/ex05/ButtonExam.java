package ex05;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnok = new Button();
		
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println(" Ok 버튼을 클릭했습니다.");
			}
			}
		//11 호출
		btnok.setClickListener( new OkListener());
		btnok.click();
		
		Button btnCancel = new Button();
		class ClickListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println(" Cancel 버튼을 클릭했습니다.");
			}
			}
		
		btnCancel.setClickListener( new cancelListener());
		btnCancel.click();
		
		Button Doublebtnok = new Button() {
		class DoubleListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println(" 더블 클릭 했습니다");
			}
			}
		DoublebtnOk.setClickListener( new DoubleListener());
		DoublebtnOk.click();
		
	
		
		}
