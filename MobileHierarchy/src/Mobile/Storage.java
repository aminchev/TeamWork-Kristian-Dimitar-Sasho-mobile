package Mobile;

import java.util.ArrayList;

public class Storage {
	static ArrayList<Poster> posters = new ArrayList<Poster>();
	private static Storage ourStorage = null;

	private Storage() {
		System.out.println("We made storage!");
	}

	public static Storage getStorage() {
		if (ourStorage == null) {
			ourStorage = new Storage();
		}
		return ourStorage;
	}

	void showAllVehicles(){
		for(int index = 0; index<Storage.posters.size(); index++){
			System.out.println(index+1 + ":" + Storage.posters.get(index).getVehicle().getBrand()
					+ "," + Storage.posters.get(index).getVehicle().getModel());
		}
	}
	
	
	//�� ���� ���� ��� ������ �� ������� ��� � ������� �����, ����� � ��������
	public ArrayList<Poster> getPosters() {
		return posters;
	}

	public void setPosters(ArrayList<Poster> posters) {
		this.posters = posters;
	}
}
