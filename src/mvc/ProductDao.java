package mvc;

public class ProductDao {
	public ProductDao() {}
	public void ProductInsert(ProductDTO product) {
		System.out.println("DB�� product�Է�");
		System.out.println(product);
		System.out.println("�Է¿Ϸ�");
	}
	public void productDelete(int id) {
		System.out.println("DB�� ID ����");
		System.out.println(id);
		System.out.println("���� �Ϸ�");
	}
	public void productUpdate(ProductDTO product) {
		System.out.println("DB�� ID ������Ʈ");
		System.out.println(product);
		System.out.println("������Ʈ �Ϸ�");
	}
}
