package vn.sunnet.game.stage;

import vn.sunnet.game.farm.assets.Assets;
import vn.sunnet.game.farm.assets.Audio;
import vn.sunnet.game.farm.main.Farm;
import vn.sunnet.game.farm.nature.F;
import vn.sunnet.game.farm.nature.SeedNature;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;

public class Message {

	private static final int UPLEVEL = 0, APPELLATION = 1, MISSION = 2;
	private static final String path = "data/message/";
	private static String array_name[] = {"hieu-khach", "vui-ve", "dang-yeu", "than-thien", "giau-co",
		"hanh-phuc"};
	private int lv_appellation[] = {4, 8, 12, 20, 30, 40};
	
	private Button close, post_score;
	private TextureRegion region;
	private Image image;
	private Texture texture, icon, line, appellation, abc;
	private BitmapFont bmpfont;
	private Stage stage;
	private int level, nof_season;
	private boolean gc = false, flag = false;
	private Vector2 pos;
	private float alpha = 0;
	public long experience;
	public int type;

	public Message(int type, int level, long n, Stage sta) {
		this.type = type;
		this.level = level;
		
		stage = new Stage();

		stage.setViewport(sta.getViewport());
		line = Assets.manager.get("data/texture/line.png", Texture.class);
				
		switch(type) {
		case UPLEVEL:
			this.experience = n;
			texture = Assets.manager.get(path + "level.png", Texture.class);
			bmpfont = Assets.manager.get("data/font/font-vang.fnt", BitmapFont.class);
			for(int i = 0; i < 12; i++) {
				if(SeedNature.getflowerUnlock(i) == level) {
					flag = true;
					icon = Assets.manager.get("data/icon/" + SeedNature.flower[i] + ".png", Texture.class);
					break;
				}
				if(SeedNature.getfruitUnlock(i) == level) {
					flag = true;
					icon = Assets.manager.get("data/icon/" + SeedNature.fruit[i] + ".png", Texture.class);
					break;
				}
			}
			
			if(flag) {
				abc = Assets.manager.get(path + "level1.png", Texture.class);
			}
			
			post_score = createButton(path + "gui-diem.png");
			post_score.setPosition(545, 110);
			
			close = createButton("data/texture/close.png");
			close.setPosition(850, 522);
			stage.addActor(post_score);
			stage.addActor(close);
			break;
		case APPELLATION:
			this.nof_season = (int) n;
			texture = Assets.manager.get(path + "danh-hieu.png", Texture.class);
			bmpfont = Assets.manager.get("data/font/font-vang.fnt", BitmapFont.class);
			for(int i = 0; i <6; i++)
				if(nof_season < lv_appellation[i]) {
					//Tracker:
					Farm.payment.Tracker(3, -1, array_name[i]);
					appellation = Assets.manager.get(path + array_name[i] + ".png", Texture.class);
					break;
				}
			pos = new Vector2(640 - appellation.getWidth()/2, 470);
			
			close = createButton("data/texture/close.png");
			close.setPosition(836, 522);
			stage.addActor(close);
			break;
		case MISSION:
			texture = Assets.manager.get("data/shop/nuoc-than.png", Texture.class);
			region = TextureRegion.split(texture, texture.getWidth()/2, texture.getHeight())[0][0];
			texture = Assets.manager.get(path + "nhiem-vu.png", Texture.class);
			bmpfont = Assets.manager.get("data/font/cua-hang.fnt", BitmapFont.class);
			
			post_score = createButton(path + "nhan.png");
			post_score.setPosition(545, 110);
			stage.addActor(post_score);
			break;
		
		// Tang nhan cong tu dong cho nguoi choi ////nhan-cong-animation-10.png
		case 3:
			texture = Assets.manager.get("data/texture/nhan-cong-animation-10.png", Texture.class);
			region = TextureRegion.split(texture, texture.getWidth()/4, texture.getHeight())[0][0];
			image = new Image(region);
			image.setPosition(560, 178);
			
			texture = Assets.manager.get(path + "khung.png", Texture.class);
			bmpfont = Assets.manager.get("data/font/cua-hang.fnt", BitmapFont.class);
			
			post_score = createButton(path + "nhan.png");
			post_score.setPosition(525, 75);
			stage.addActor(post_score);
			break;
		//Thong bao het han su dung nhan cong
		case 4:
			texture = Assets.manager.get(path + "khung.png", Texture.class);
			bmpfont = Assets.manager.get("data/font/cua-hang.fnt", BitmapFont.class);
			
			close = createButton("data/texture/close.png");
			close.setPosition(790, 522);
			stage.addActor(close);
			break;
		}
		
		Gdx.input.setInputProcessor(stage);
	}
	
	public Button createButton(String name) {
		Texture texture = Assets.manager.get(name, Texture.class);
		TextureRegion[] tregion = TextureRegion.split(texture, texture.getWidth()/2, texture.getHeight())[0];
		return new Button(new TextureRegionDrawable(tregion[0]), new TextureRegionDrawable(tregion[1]), 
				new TextureRegionDrawable(tregion[1]));
	}
	
	public void render(SpriteBatch batch) {
		batch.begin();
		alpha += 0.2f;
		for(int i = 0; i < 18; i ++)
			batch.draw(new TextureRegion(line), 640, 360, 0, 0, 696, 163, 1, 1, i * 20 + alpha);
		batch.draw(texture, 290, 0);
		
		switch(type) {
		case UPLEVEL:
			bmpfont.draw(batch, "" + level, 0, 560, 1280, Align.center, false);
			if(flag) {
				batch.draw(abc, 440, 360);
				batch.draw(new TextureRegion(icon), 600, 210, 0, 0, icon.getWidth(), icon.getHeight(), 2, 2, 0);
			}
			break;
		case APPELLATION:
			batch.draw(appellation, pos.x, pos.y);
			bmpfont.draw(batch, "" + nof_season, 0, 420, 1280, Align.center, false);
			break;
		case MISSION:
			batch.draw(region, 600, 210);
			bmpfont.draw(batch, "Tặng 1 nước\n thần", 420, 420, 200, Align.center, false);
			break;
		
		//Thong bao tang 1 nhan cong tu dong
		case 3:
			image.draw(batch, 1.0f);
			//Tặng bạn một nhân \ncông tự động trong 1 giờ !
			//
			bmpfont.draw(batch, "QÙA TẶNG TÂN GIA\n", 375, 560, 500, Align.center, false);
			bmpfont.draw(batch, "Hi vọng bạn sẽ có\n những phút giây thật sự \nvui vẻ !", 375, 500, 500, Align.center, false);
			break;
		//Thong bao het thoi gian su dung nhan cong tu dong
		case 4:
			bmpfont.draw(batch, "Hết thời gian sử dụng\n nhân công tự động.\n\n Để sử dụng " +
					"nhân công tự \nđộng bạn hãy vào cửa hàng \nđể mua nhé !", 370, 500, 500, Align.center, false);
			break;
		}		
		batch.end();
		
		stage.draw();		
		update();
	}
	
	public void update() {
		switch(type) {
		case UPLEVEL:
			if(post_score.isChecked()) {
				post_score.setChecked(false);
				Audio.btnClick.play(Audio.soundVolume);
				Farm.payment.postHighScore(experience);
			}
			
			if(close.isChecked()) {
				Audio.btnClick.play(Audio.soundVolume);
				gc = true;
			}
			break;
		case APPELLATION:
			if(close.isChecked()) {
				Audio.btnClick.play(Audio.soundVolume);
				gc = true;
			}
			break;
		case MISSION:
			if(post_score.isChecked()) {
				Audio.btnClick.play(Audio.soundVolume);
				F.nof_wgod += 1;
				gc = true;
			}
			
		case 3:
			if(post_score.isChecked()) {
				Audio.btnClick.play(Audio.soundVolume);
				gc = true;
			}
			break;
		case 4:
			if(close.isChecked()) {
				Audio.btnClick.play(Audio.soundVolume);
				gc = true;
			}
			break;
		}		
	}
	
	public boolean gc() {
		return gc;
	}
	
	public void dispose() {
		stage.dispose();
	}
}