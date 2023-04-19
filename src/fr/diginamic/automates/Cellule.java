package fr.diginamic.automates;

public class Cellule {

	private boolean hasLeft;
	private boolean hasRight;
	private boolean hasTop;
	private boolean hasBottom;
	private boolean hasLeftTop;
	private boolean hasRightTop;
	private boolean hasLeftBottom;
	private boolean hasRightBottom;

	public boolean isHasLeftTop() {
		return hasLeftTop;
	}

	public void setHasLeftTop(boolean hasLeftTop) {
		this.hasLeftTop = hasLeftTop;
	}

	public boolean isHasRightTop() {
		return hasRightTop;
	}

	public void setHasRightTop(boolean hasRightTop) {
		this.hasRightTop = hasRightTop;
	}

	public boolean isHasLeftBottom() {
		return hasLeftBottom;
	}

	public void setHasLeftBottom(boolean hasLeftBottom) {
		this.hasLeftBottom = hasLeftBottom;
	}

	public boolean isHasRightBottom() {
		return hasRightBottom;
	}

	public void setHasRightBottom(boolean hasRightBottom) {
		this.hasRightBottom = hasRightBottom;
	}

	private int positionX;
	private int positionY;
	private boolean isVisible;
	private boolean willSurvive;
	private boolean willGiveBirth;
	private int nombreCelluleAdj = 0;

	public Cellule(int positionX, int positionY, boolean isVisible) {
		super();
		this.positionX = positionX;
		this.positionY = positionY;
		this.isVisible = isVisible;
	}

	@Override
	public String toString() {
		return "Cellule [hasLeft=" + hasLeft + ", hasRight=" + hasRight + ", hasTop=" + hasTop + ", hasBottom="
				+ hasBottom + ", positionX=" + positionX + ", positionY=" + positionY + ", isVisible=" + isVisible
				+ ", willSurvive=" + willSurvive + ", willGiveBirth=" + willGiveBirth + ", nombreCelluleAdj="
				+ nombreCelluleAdj + "]";
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public boolean isWillSurvive() {
		return willSurvive;
	}

	public void setWillSurvive(boolean willSurvive) {
		this.willSurvive = willSurvive;
	}

	public boolean isWillGiveBirth() {
		return willGiveBirth;
	}

	public void setWillGiveBirth(boolean willGiveBirth) {
		this.willGiveBirth = willGiveBirth;
	}

	public boolean isHasLeft() {
		return hasLeft;
	}

	public void setHasLeft(boolean hasLeft) {
		this.hasLeft = hasLeft;
	}

	public boolean isHasRight() {
		return hasRight;
	}

	public void setHasRight(boolean hasRight) {
		this.hasRight = hasRight;
	}

	public boolean isHasTop() {
		return hasTop;
	}

	public void setHasTop(boolean hasTop) {
		this.hasTop = hasTop;
	}

	public boolean isHasBottom() {
		return hasBottom;
	}

	public void setHasBottom(boolean hasBottom) {
		this.hasBottom = hasBottom;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getNombreCelluleAdj() {
		return nombreCelluleAdj;
	}

	public void setNombreCelluleAdj(int nombreCelluleAdj) {
		this.nombreCelluleAdj = nombreCelluleAdj;
	}

}
