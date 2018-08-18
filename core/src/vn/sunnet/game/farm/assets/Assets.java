package vn.sunnet.game.farm.assets;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Assets {	
	public static AssetManager manager = new AssetManager();
	private static TextureParameter parameter;
//	public static ResourceFileHandleResolver resolver;
	
	private static String path = "data/texture/";
	private static String ipath = "data/icon/";
	private static String fpath = "data/font/";
	private static String flpath = "data/seed/flower/";
	private static String fwpath = "data/seed/fruit/";
	private static String spath = "data/shop/";
	private static String mpath = "data/market/";
	private static String wpath = "data/warehouse/";
	private static String upath = "data/message/";
	
	public static void load() {

		parameter = new TextureParameter();
		parameter.minFilter = TextureFilter.Linear;
		parameter.magFilter = TextureFilter.Linear;
		
		manager.load(path + "ban.png", Texture.class, parameter);
		manager.load(path + "nap-xu.png", Texture.class, parameter);
		manager.load(path + "nhan.png", Texture.class, parameter);
		manager.load(path + "shadow.png", Texture.class, parameter);
		manager.load(path + "icon-cua-hang.png", Texture.class, parameter);
		manager.load(path + "icon-hat-giong.png", Texture.class, parameter);
		manager.load(path + "icon-pause.png", Texture.class, parameter);
		manager.load(path + "icon-kho-chua.png", Texture.class, parameter);		
		manager.load(path + "land-0.png", Texture.class, parameter);
		manager.load(path + "land-1.png", Texture.class, parameter);
		manager.load(path + "level-1.png", Texture.class, parameter);
		manager.load(path + "level-2.png", Texture.class, parameter);
		manager.load(path + "icon-nho-cay.png", Texture.class, parameter);
		manager.load(path + "thanh-mau-1.png", Texture.class, parameter);
		manager.load(path + "thanh-mau-2.png", Texture.class, parameter);
		manager.load(path + "icon-thi-truong.png", Texture.class, parameter);
		manager.load(path + "xu.png", Texture.class, parameter);
		manager.load(path + "mua-xuan.jpg", Texture.class, parameter);
		manager.load(path + "mua-ha.jpg", Texture.class, parameter);
		manager.load(path + "mua-thu.jpg", Texture.class, parameter);
		manager.load(path + "mua-dong.jpg", Texture.class, parameter);
		manager.load(path + "thu-hoach.png", Texture.class, parameter);
		manager.load(path + "tuoi-nuoc.png", Texture.class, parameter);
		manager.load(path + "nhan-cong-animation-0.png", Texture.class, parameter);
		manager.load(path + "nhan-cong-animation-1.png", Texture.class, parameter);
		manager.load(path + "nhan-cong-animation-2.png", Texture.class, parameter);
		manager.load(path + "nhan-cong-animation-3.png", Texture.class, parameter);		
		manager.load(path + "nhan-cong-animation-00.png", Texture.class, parameter);
		manager.load(path + "nhan-cong-animation-10.png", Texture.class, parameter);
		manager.load(path + "nhan-cong-animation-20.png", Texture.class, parameter);
		manager.load(path + "nhan-cong-animation-30.png", Texture.class, parameter);
		
		manager.load(path + "bui-cay-xanh.png", Texture.class, parameter);
		manager.load(path + "bui-cay-trang.png", Texture.class, parameter);
		manager.load(path + "bui-cay-vang.png", Texture.class, parameter);
		manager.load(path + "bui-cay-do.png", Texture.class, parameter);
		manager.load(path + "bui-cay-tim.png", Texture.class, parameter);
		manager.load(path + "khach-le-2b.png", Texture.class, parameter);
		manager.load(path + "khach-le-2c.png", Texture.class, parameter);
		manager.load(path + "khach-buon-a.png", Texture.class, parameter);
		manager.load(path + "khach-buon-b.png", Texture.class, parameter);
		manager.load(path + "khach-le-a.png", Texture.class, parameter);
		manager.load(path + "khach-le-b.png", Texture.class, parameter);
		manager.load(path + "thoat.png", Texture.class, parameter);
		manager.load(path + "line.png", Texture.class, parameter);
		
		manager.load(path + "gieo-hat-0.png", Texture.class, parameter);
		manager.load(path + "gieo-hat-1.png", Texture.class, parameter);
		manager.load(path + "gieo-hat-2.png", Texture.class, parameter);
		manager.load(path + "nho-cay-0.png", Texture.class, parameter);
		manager.load(path + "nho-cay-1.png", Texture.class, parameter);
		manager.load(path + "nho-cay-2.png", Texture.class, parameter);
		manager.load(path + "tuoi-cay-0.png", Texture.class, parameter);
		manager.load(path + "tuoi-cay-1.png", Texture.class, parameter);
		manager.load(path + "tuoi-cay-2.png", Texture.class, parameter);
		
		manager.load(path + "gieo-hat-00.png", Texture.class, parameter);
		manager.load(path + "gieo-hat-10.png", Texture.class, parameter);
		manager.load(path + "gieo-hat-20.png", Texture.class, parameter);
		manager.load(path + "nho-cay-00.png", Texture.class, parameter);
		manager.load(path + "nho-cay-10.png", Texture.class, parameter);
		manager.load(path + "nho-cay-20.png", Texture.class, parameter);
		manager.load(path + "tuoi-cay-00.png", Texture.class, parameter);
		manager.load(path + "tuoi-cay-10.png", Texture.class, parameter);
		manager.load(path + "tuoi-cay-20.png", Texture.class, parameter);
		
		manager.load(path + "bien-bao-1.png", Texture.class, parameter);
		manager.load(path + "bien-bao-2.png", Texture.class, parameter);
		manager.load(path + "icbien-bao.png", Texture.class, parameter);
		manager.load(path + "close.png", Texture.class, parameter);
		manager.load(path + "mui-ten-trai-0.png", Texture.class, parameter);
		manager.load(path + "mui-ten-phai-0.png", Texture.class, parameter);
		manager.load(path + "mui-ten-trai-1.png", Texture.class, parameter);
		manager.load(path + "mui-ten-phai-1.png", Texture.class, parameter);
		manager.load(path + "expansion.png", Texture.class, parameter);
		manager.load(path + "nuoc-than.png", Texture.class, parameter);
		manager.load(path + "nho-cay.png", Texture.class, parameter);
		manager.load(path + "back.png", Texture.class, parameter);
		manager.load(path + "icon-YES.png", Texture.class, parameter);
		manager.load(path + "icon-NO.png", Texture.class, parameter);
		manager.load(path + "thong-tin.png", Texture.class, parameter);
		manager.load(path + "nang-cap.png", Texture.class, parameter);
		manager.load(path + "nang-cap-2.png", Texture.class, parameter);
		manager.load(path + "khung-upg.png", Texture.class, parameter);
		manager.load(path + "bg-thong-tin.png", Texture.class, parameter);
		manager.load(path + "bg-nang-cap.png", Texture.class, parameter);
		manager.load(path + "dat-nc-0.png", Texture.class, parameter);
		manager.load(path + "dat-nc-1.png", Texture.class, parameter);
		manager.load(path + "dat-nc-2.png", Texture.class, parameter);
		manager.load(path + "dat-nc-3.png", Texture.class, parameter);
		manager.load(path + "dat-nc-4.png", Texture.class, parameter);
		manager.load(path + "dat-nc-5.png", Texture.class, parameter);
		manager.load(path + "check-box.png", Texture.class, parameter);		
		manager.load(path + "cai-dat.png", Texture.class, parameter);
		manager.load(path + "thanh-tich.png", Texture.class, parameter);
		manager.load(path + "pause-bg.png", Texture.class, parameter);
		manager.load(path + "tiep-tuc.png", Texture.class, parameter);
		manager.load(path + "home.png", Texture.class, parameter);
		manager.load(path + "hnang-cap.png", Texture.class, parameter);
		manager.load(path + "mo-rong-dat.png", Texture.class, parameter);
		
		manager.load(path + "nhan-cong.png", Texture.class, parameter);
		manager.load(path + "giay-nhiem-vu.png", Texture.class, parameter);
		manager.load(path + "qua-tang.png", Texture.class, parameter);
		manager.load(path + "qua-gan-bo.png", Texture.class, parameter);
		manager.load(path + "khung-nhiem-vu.png", Texture.class, parameter);
		
		manager.load(ipath + "dong-tien.png", Texture.class, parameter);
		manager.load(ipath + "cam-chuong.png", Texture.class, parameter);
		manager.load(ipath + "hoa-sen.png", Texture.class, parameter);
		manager.load(ipath + "tu-cau.png", Texture.class, parameter);
		manager.load(ipath + "lily.png", Texture.class, parameter);
		manager.load(ipath + "lily-loa-ken.png", Texture.class, parameter);
		manager.load(ipath + "trang-nguyen.png", Texture.class, parameter);
		manager.load(ipath + "hoa-hong.png", Texture.class, parameter);
		manager.load(ipath + "huong-duong.png", Texture.class, parameter);
		manager.load(ipath + "violet.png", Texture.class, parameter);
		manager.load(ipath + "bo-cong-anh.png", Texture.class, parameter);
		manager.load(ipath + "tulip.png", Texture.class, parameter);

		manager.load(ipath + "bi-ngo.png", Texture.class, parameter);
		manager.load(ipath + "ca-chua.png", Texture.class, parameter);
		manager.load(ipath + "ca-tim.png", Texture.class, parameter);
		manager.load(ipath + "cam.png", Texture.class, parameter);
		manager.load(ipath + "chuoi.png", Texture.class, parameter);
		manager.load(ipath + "cu-cai.png", Texture.class, parameter);
		manager.load(ipath + "dua-hau.png", Texture.class, parameter);
		manager.load(ipath + "nho.png", Texture.class, parameter);
		manager.load(ipath + "tao.png", Texture.class, parameter);
		manager.load(ipath + "xoai.png", Texture.class, parameter);
		manager.load(ipath + "dau-tay.png", Texture.class, parameter);
		manager.load(ipath + "le.png", Texture.class, parameter);		
		
		manager.load(upath + "dang-yeu.png", Texture.class, parameter);
		manager.load(upath + "giau-co.png", Texture.class, parameter);
		manager.load(upath + "hanh-phuc.png", Texture.class, parameter);
		manager.load(upath + "hieu-khach.png", Texture.class, parameter);
		manager.load(upath + "than-thien.png", Texture.class, parameter);
		manager.load(upath + "vui-ve.png", Texture.class, parameter);
		manager.load(upath + "danh-hieu.png", Texture.class, parameter);
		manager.load(upath + "gui-diem.png", Texture.class, parameter);
		manager.load(upath + "level.png", Texture.class, parameter);
		manager.load(upath + "level1.png", Texture.class, parameter);
		manager.load(upath + "nhan.png", Texture.class, parameter);
		manager.load(upath + "nhiem-vu.png", Texture.class, parameter);
		manager.load(upath + "khung.png", Texture.class, parameter);
		
		manager.load("data/seed/hat-giong.png", Texture.class, parameter);
		manager.load("data/seed/cay-non.png", Texture.class, parameter);
		manager.load("data/seed/cay-lon.png", Texture.class, parameter);
		
		manager.load(flpath + "bo-cong-anh.png", Texture.class, parameter);
		manager.load(flpath + "cam-chuong.png", Texture.class, parameter);
		manager.load(flpath + "dong-tien.png", Texture.class, parameter);
		manager.load(flpath + "hoa-hong.png", Texture.class, parameter);
		manager.load(flpath + "hoa-sen.png", Texture.class, parameter);
		manager.load(flpath + "huong-duong.png", Texture.class, parameter);
		manager.load(flpath + "lily-loa-ken.png", Texture.class, parameter);
		manager.load(flpath + "lily.png", Texture.class, parameter);
		manager.load(flpath + "trang-nguyen.png", Texture.class, parameter);
		manager.load(flpath + "tu-cau.png", Texture.class, parameter);
		manager.load(flpath + "tulip.png", Texture.class, parameter);		
		manager.load(flpath + "violet.png", Texture.class, parameter);
		
		manager.load(fwpath + "bi-ngo.png", Texture.class, parameter);
		manager.load(fwpath + "ca-chua.png", Texture.class, parameter);
		manager.load(fwpath + "ca-tim.png", Texture.class, parameter);
		manager.load(fwpath + "cam.png", Texture.class, parameter);
		manager.load(fwpath + "chuoi.png", Texture.class, parameter);
		manager.load(fwpath + "cu-cai.png", Texture.class, parameter);
		manager.load(fwpath + "dau-tay.png", Texture.class, parameter);
		manager.load(fwpath + "dua-hau.png", Texture.class, parameter);
		manager.load(fwpath + "le.png", Texture.class, parameter);
		manager.load(fwpath + "nho.png", Texture.class, parameter);
		manager.load(fwpath + "tao.png", Texture.class, parameter);
		manager.load(fwpath + "xoai.png", Texture.class, parameter);		
		
		manager.load(fpath + "garden.fnt", BitmapFont.class);
		manager.load(fpath + "level.fnt", BitmapFont.class);
		manager.load(fpath + "xu.fnt", BitmapFont.class);
		manager.load(fpath + "font-hoan-chinh.fnt", BitmapFont.class);
		manager.load(fpath + "kho-chua.fnt", BitmapFont.class);
		manager.load(fpath + "font-xanh.fnt", BitmapFont.class);
		manager.load(fpath + "cua-hang.fnt", BitmapFont.class);
		manager.load(fpath + "font-vang.fnt", BitmapFont.class);
		manager.load(fpath + "font_clock.fnt", BitmapFont.class);
		
		manager.load(mpath + "co-0.png", Texture.class, parameter);
		manager.load(mpath + "co-1.png", Texture.class, parameter);
		manager.load(mpath + "co-2.png", Texture.class, parameter);
		manager.load(mpath + "bat-dau.png", Texture.class);
		manager.load(mpath + "tam-dung.png", Texture.class);
		manager.load(mpath + "khung-thong-tin.png", Texture.class);
		manager.load(mpath + "chung-cu.png", Texture.class);
		manager.load(mpath + "cong-vien.png", Texture.class);
		manager.load(mpath + "cua-hang-cafe.png", Texture.class);
		manager.load(mpath + "fastfood.png", Texture.class);
		manager.load(mpath + "khach-san.png", Texture.class);
		manager.load(mpath + "kho-luong-thuc.png", Texture.class);
		manager.load(mpath + "map.jpg", Texture.class);
		manager.load(mpath + "nha-ga.png", Texture.class);
		manager.load(mpath + "nha-hang-nhat.png", Texture.class);
		manager.load(mpath + "truong-hoc.png", Texture.class);
		manager.load(mpath + "van-phong.png", Texture.class);
		manager.load(mpath + "vuon-hoa.png", Texture.class);
		manager.load(mpath + "thong-tin.png", Texture.class, parameter);
		manager.load(mpath + "textbox.png", Texture.class, parameter);
		manager.load(mpath + "vuon-thu.png", Texture.class, parameter);
		manager.load(mpath + "bat-dau-mua-ban.png", Texture.class, parameter);
		manager.load(mpath + "tam-dung-mua-ban.png", Texture.class, parameter);
		manager.load(mpath + "tiep-tuc-mua-ban.png", Texture.class, parameter);		
		
		manager.load(spath + "cua-hang.png", Texture.class);
		manager.load(spath + "nhan-cong.png", Texture.class);
		manager.load(spath + "icnhan-cong.png", Texture.class);
		manager.load(spath + "hoa.png", Texture.class);
		manager.load(spath + "qua.png", Texture.class);
		manager.load(spath + "mui-ten-trai.png", Texture.class);
		manager.load(spath + "mui-ten-phai.png", Texture.class);
		manager.load(spath + "thong-tin.png", Texture.class);
		
		manager.load(spath + "bo-cong-anh.png", Texture.class);
		manager.load(spath + "cam-chuong.png", Texture.class);
		manager.load(spath + "tu-cau.png", Texture.class);
		manager.load(spath + "dong-tien.png", Texture.class);
		manager.load(spath + "hoa-hong.png", Texture.class);
		manager.load(spath + "huong-duong.png", Texture.class);
		manager.load(spath + "lily-loa-ken.png", Texture.class);
		manager.load(spath + "lily.png", Texture.class);
		manager.load(spath + "hoa-sen.png", Texture.class);
		manager.load(spath + "trang-nguyen.png", Texture.class);
		manager.load(spath + "tulip.png", Texture.class);
		manager.load(spath + "violet.png", Texture.class);
		
		manager.load(spath + "bi-ngo.png", Texture.class, parameter);
		manager.load(spath + "ca-chua.png", Texture.class, parameter);
		manager.load(spath + "ca-tim.png", Texture.class, parameter);
		manager.load(spath + "cam.png", Texture.class, parameter);
		manager.load(spath + "chuoi.png", Texture.class, parameter);
		manager.load(spath + "cu-cai.png", Texture.class, parameter);
		manager.load(spath + "dau-tay.png", Texture.class, parameter);
		manager.load(spath + "dua-hau.png", Texture.class, parameter);
		manager.load(spath + "le.png", Texture.class, parameter);
		manager.load(spath + "nho.png", Texture.class, parameter);
		manager.load(spath + "tao.png", Texture.class, parameter);
		manager.load(spath + "nuoc-than.png", Texture.class, parameter);
		manager.load(spath + "xoai.png", Texture.class, parameter);
		manager.load(spath + "ban.png", Texture.class, parameter);
		manager.load(spath + "icon-xu.png", Texture.class, parameter);
		manager.load(spath + "icon-gold.png", Texture.class, parameter);
		manager.load(spath + "khung-thong-tin.png", Texture.class, parameter);
		manager.load(spath + "khung-thong-tin-2.png", Texture.class, parameter);
		manager.load(spath + "giay-bao-dam.png", Texture.class, parameter);
		manager.load(spath + "ngoc-may-man.png", Texture.class, parameter);
		
		manager.load(wpath + "bar.png", Texture.class, parameter);
		manager.load(wpath + "icon-mui-ten-1.png", Texture.class, parameter);
		manager.load(wpath + "icon-mui-ten-2.png", Texture.class, parameter);
		
		manager.load(wpath + "bi-ngo.png", Texture.class, parameter);
		manager.load(wpath + "bo-cong-anh.png", Texture.class, parameter);
		manager.load(wpath + "ca-tim.png", Texture.class, parameter);
		manager.load(wpath + "ca-chua.png", Texture.class, parameter);
		manager.load(wpath + "cam-chuong.png", Texture.class, parameter);
		manager.load(wpath + "cam.png", Texture.class, parameter);
		manager.load(wpath + "chuoi.png", Texture.class, parameter);
		manager.load(wpath + "cu-cai.png", Texture.class, parameter);
		manager.load(wpath + "dau-tay.png", Texture.class, parameter);
		manager.load(wpath + "dong-tien.png", Texture.class, parameter);
		manager.load(wpath + "dua-hau.png", Texture.class, parameter);
		manager.load(wpath + "hoa-hong.png", Texture.class, parameter);
		manager.load(wpath + "huong-duong.png", Texture.class, parameter);
		manager.load(wpath + "le.png", Texture.class, parameter);
		manager.load(wpath + "lily-loa-ken.png", Texture.class, parameter);
		manager.load(wpath + "lily.png", Texture.class, parameter);
		manager.load(wpath + "nho.png", Texture.class, parameter);
		manager.load(wpath + "hoa-sen.png", Texture.class, parameter);
		manager.load(wpath + "tao.png", Texture.class, parameter);
		manager.load(wpath + "trang-nguyen.png", Texture.class, parameter);
		manager.load(wpath + "tu-cau.png", Texture.class, parameter);
		manager.load(wpath + "tulip.png", Texture.class, parameter);
		manager.load(wpath + "violet.png", Texture.class, parameter);
		manager.load(wpath + "xoai.png", Texture.class, parameter);
		manager.load(wpath + "btn-ban.png", Texture.class, parameter);
		manager.load(wpath + "thong-tin-ban.png", Texture.class, parameter);
	}
}