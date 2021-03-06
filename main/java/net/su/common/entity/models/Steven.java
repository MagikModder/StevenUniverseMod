package net.su.common.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

/**
 * ModelBiped - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class Steven extends ModelBase {
    public ModelRenderer LeftLeg;
    public ModelRenderer Body;
    public ModelRenderer RightLeg;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer Hair6;
    public ModelRenderer Hair7;
    public ModelRenderer Hair8;
    public ModelRenderer Hair9;
    public ModelRenderer Hair10;
    public ModelRenderer Hair11;
    public ModelRenderer Hair12;
    public ModelRenderer Hair13;
    public ModelRenderer Hair14;
    public ModelRenderer Hair15;
    public ModelRenderer Hair16;
    public ModelRenderer Hair17;
    public ModelRenderer Hair18;
    public ModelRenderer Hair19;
    public ModelRenderer Hair20;
    public ModelRenderer Hair21;
    public ModelRenderer Hair22;
    public ModelRenderer Hair23;
    public ModelRenderer Hair24;
    public ModelRenderer Hair25;
    public ModelRenderer Hair26;
    public ModelRenderer Hair27;
    public ModelRenderer Hair28;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer Head;
    
    public boolean isAttacking;

    public Steven() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Hair12 = new ModelRenderer(this, 0, 31);
        this.Hair12.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Hair12.addBox(3.4F, -8.3F, -3.5F, 1, 3, 7, 0.0F);
        this.Hair13 = new ModelRenderer(this, 0, 31);
        this.Hair13.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair13.addBox(-11.0F, -5.0F, -1.0F, 1, 2, 5, 0.0F);
        this.Hair11 = new ModelRenderer(this, 0, 31);
        this.Hair11.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Hair11.addBox(3.4F, -7.9F, -4.0F, 1, 3, 8, 0.0F);
        this.Hair27 = new ModelRenderer(this, 0, 33);
        this.Hair27.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair27.addBox(-4.0F, -8.4F, -4.0F, 8, 1, 8, 0.0F);
        this.Hair2 = new ModelRenderer(this, 0, 31);
        this.Hair2.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair2.addBox(10.0F, -1.0F, 2.0F, 1, 1, 2, 0.0F);
        this.Hair25 = new ModelRenderer(this, 0, 31);
        this.Hair25.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Hair25.addBox(-4.4F, -7.9F, -4.0F, 1, 3, 8, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 15.1F, 0.0F);
        this.Body.addBox(-4.0F, -10.0F, -2.0F, 8, 10, 4, 0.0F);
        this.Hair18 = new ModelRenderer(this, 0, 33);
        this.Hair18.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair18.addBox(-4.0F, -8.0F, 3.4F, 8, 8, 1, 0.0F);
        this.Hair26 = new ModelRenderer(this, 0, 31);
        this.Hair26.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Hair26.addBox(-4.4F, -8.3F, -3.5F, 1, 3, 7, 0.0F);
        this.Hair20 = new ModelRenderer(this, 0, 33);
        this.Hair20.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair20.addBox(1.0F, -7.0F, -4.3F, 3, 1, 1, 0.0F);
        this.Hair14 = new ModelRenderer(this, 0, 31);
        this.Hair14.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair14.addBox(-11.0F, -3.0F, 0.0F, 1, 1, 4, 0.0F);
        this.Hair16 = new ModelRenderer(this, 0, 31);
        this.Hair16.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair16.addBox(-11.0F, -1.0F, 2.0F, 1, 1, 2, 0.0F);
        this.Hair8 = new ModelRenderer(this, 0, 31);
        this.Hair8.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair8.addBox(-11.0F, -5.0F, -4.0F, 1, 2, 1, 0.0F);
        this.Hair1 = new ModelRenderer(this, 0, 33);
        this.Hair1.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair1.addBox(3.0F, -6.0F, -4.3F, 1, 1, 1, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, -8.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-2.0F, 15.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.1F, -2.0F, 4, 9, 4, 0.0F);
        this.Hair19 = new ModelRenderer(this, 0, 33);
        this.Hair19.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair19.addBox(-3.5F, -8.4F, 3.4F, 7, 1, 1, 0.0F);
        this.Hair10 = new ModelRenderer(this, 0, 31);
        this.Hair10.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair10.addBox(-11.0F, -5.0F, -4.0F, 1, 2, 1, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(2.0F, 15.1F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.Hair17 = new ModelRenderer(this, 0, 33);
        this.Hair17.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair17.addBox(-3.5F, -8.8F, -4.0F, 7, 1, 8, 0.0F);
        this.Hair4 = new ModelRenderer(this, 0, 31);
        this.Hair4.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair4.addBox(10.0F, -5.0F, -4.0F, 1, 2, 1, 0.0F);
        this.Hair21 = new ModelRenderer(this, 0, 33);
        this.Hair21.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair21.addBox(-4.0F, -7.0F, -4.3F, 3, 1, 1, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, -8.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F);
        this.Hair6 = new ModelRenderer(this, 0, 31);
        this.Hair6.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair6.addBox(10.0F, -3.0F, 0.0F, 1, 1, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Hair22 = new ModelRenderer(this, 0, 33);
        this.Hair22.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair22.addBox(-4.0F, -6.0F, -4.3F, 1, 1, 1, 0.0F);
        this.Hair23 = new ModelRenderer(this, 0, 33);
        this.Hair23.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair23.addBox(-4.0F, -8.0F, -4.3F, 8, 1, 1, 0.0F);
        this.Hair24 = new ModelRenderer(this, 0, 33);
        this.Hair24.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair24.addBox(-3.5F, -8.4F, -4.3F, 7, 1, 1, 0.0F);
        this.Hair28 = new ModelRenderer(this, 0, 33);
        this.Hair28.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair28.addBox(-4.0F, -8.8F, -3.5F, 8, 1, 7, 0.0F);
        this.Hair3 = new ModelRenderer(this, 0, 31);
        this.Hair3.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair3.addBox(-4.4F, -8.0F, -4.0F, 1, 3, 8, 0.0F);
        this.Hair7 = new ModelRenderer(this, 0, 31);
        this.Hair7.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair7.addBox(10.0F, -2.0F, 1.0F, 1, 1, 3, 0.0F);
        this.Hair5 = new ModelRenderer(this, 0, 31);
        this.Hair5.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair5.addBox(10.0F, -5.0F, -1.0F, 1, 2, 5, 0.0F);
        this.Hair15 = new ModelRenderer(this, 0, 31);
        this.Hair15.setRotationPoint(0.0F, 5.1F, 0.0F);
        this.Hair15.addBox(-11.0F, -2.0F, 1.0F, 1, 1, 3, 0.0F);
        this.Hair9 = new ModelRenderer(this, 0, 31);
        this.Hair9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair9.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Body.addChild(this.RightArm);
        this.Body.addChild(this.LeftArm);
        this.Body.addChild(this.Head);
    }

    ModelBase base;
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	/* Animation Start (Arms) */
    	float prog = 0.1F;
    	float prog2 = 0.5F;
    	
		this.RightArm.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;


    	/* Animation Start (Legs) */
		

		this.LeftLeg.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.RightLeg.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
	
		
		/* End Animation */
			
		
		/* Attack Animation */
		if(this.isAttacking){
			
			
			this.LeftArm.rotateAngleX = MathHelper.cos(prog2 * 0.6662F + (float)Math.PI) * 1.4F * prog2;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.6F * f1;
		
		}else{
			
			this.LeftArm.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
			
			
		}
			
		/* End Attack Animation */


		
    	
    	this.Hair12.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair13.offsetX, this.Hair13.offsetY, this.Hair13.offsetZ);
        GL11.glTranslatef(this.Hair13.rotationPointX * f5, this.Hair13.rotationPointY * f5, this.Hair13.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair13.offsetX, -this.Hair13.offsetY, -this.Hair13.offsetZ);
        GL11.glTranslatef(-this.Hair13.rotationPointX * f5, -this.Hair13.rotationPointY * f5, -this.Hair13.rotationPointZ * f5);
        this.Hair13.render(f5);
        GL11.glPopMatrix();
        this.Hair11.render(f5);
        this.Hair27.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair2.offsetX, this.Hair2.offsetY, this.Hair2.offsetZ);
        GL11.glTranslatef(this.Hair2.rotationPointX * f5, this.Hair2.rotationPointY * f5, this.Hair2.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair2.offsetX, -this.Hair2.offsetY, -this.Hair2.offsetZ);
        GL11.glTranslatef(-this.Hair2.rotationPointX * f5, -this.Hair2.rotationPointY * f5, -this.Hair2.rotationPointZ * f5);
        this.Hair2.render(f5);
        GL11.glPopMatrix();
        this.Hair25.render(f5);
        this.Body.render(f5);
        this.Hair18.render(f5);
        this.Hair26.render(f5);
        this.Hair20.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair14.offsetX, this.Hair14.offsetY, this.Hair14.offsetZ);
        GL11.glTranslatef(this.Hair14.rotationPointX * f5, this.Hair14.rotationPointY * f5, this.Hair14.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair14.offsetX, -this.Hair14.offsetY, -this.Hair14.offsetZ);
        GL11.glTranslatef(-this.Hair14.rotationPointX * f5, -this.Hair14.rotationPointY * f5, -this.Hair14.rotationPointZ * f5);
        this.Hair14.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair16.offsetX, this.Hair16.offsetY, this.Hair16.offsetZ);
        GL11.glTranslatef(this.Hair16.rotationPointX * f5, this.Hair16.rotationPointY * f5, this.Hair16.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair16.offsetX, -this.Hair16.offsetY, -this.Hair16.offsetZ);
        GL11.glTranslatef(-this.Hair16.rotationPointX * f5, -this.Hair16.rotationPointY * f5, -this.Hair16.rotationPointZ * f5);
        this.Hair16.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair8.offsetX, this.Hair8.offsetY, this.Hair8.offsetZ);
        GL11.glTranslatef(this.Hair8.rotationPointX * f5, this.Hair8.rotationPointY * f5, this.Hair8.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair8.offsetX, -this.Hair8.offsetY, -this.Hair8.offsetZ);
        GL11.glTranslatef(-this.Hair8.rotationPointX * f5, -this.Hair8.rotationPointY * f5, -this.Hair8.rotationPointZ * f5);
        this.Hair8.render(f5);
        GL11.glPopMatrix();
        this.Hair1.render(f5);
        this.RightLeg.render(f5);
        this.Hair19.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair10.offsetX, this.Hair10.offsetY, this.Hair10.offsetZ);
        GL11.glTranslatef(this.Hair10.rotationPointX * f5, this.Hair10.rotationPointY * f5, this.Hair10.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair10.offsetX, -this.Hair10.offsetY, -this.Hair10.offsetZ);
        GL11.glTranslatef(-this.Hair10.rotationPointX * f5, -this.Hair10.rotationPointY * f5, -this.Hair10.rotationPointZ * f5);
        this.Hair10.render(f5);
        GL11.glPopMatrix();
        this.LeftLeg.render(f5);
        this.Hair17.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair4.offsetX, this.Hair4.offsetY, this.Hair4.offsetZ);
        GL11.glTranslatef(this.Hair4.rotationPointX * f5, this.Hair4.rotationPointY * f5, this.Hair4.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair4.offsetX, -this.Hair4.offsetY, -this.Hair4.offsetZ);
        GL11.glTranslatef(-this.Hair4.rotationPointX * f5, -this.Hair4.rotationPointY * f5, -this.Hair4.rotationPointZ * f5);
        this.Hair4.render(f5);
        GL11.glPopMatrix();
        this.Hair21.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair6.offsetX, this.Hair6.offsetY, this.Hair6.offsetZ);
        GL11.glTranslatef(this.Hair6.rotationPointX * f5, this.Hair6.rotationPointY * f5, this.Hair6.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair6.offsetX, -this.Hair6.offsetY, -this.Hair6.offsetZ);
        GL11.glTranslatef(-this.Hair6.rotationPointX * f5, -this.Hair6.rotationPointY * f5, -this.Hair6.rotationPointZ * f5);
        this.Hair6.render(f5);
        GL11.glPopMatrix();
        this.Hair22.render(f5);
        this.Hair23.render(f5);
        this.Hair24.render(f5);
        this.Hair28.render(f5);
        this.Hair3.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair7.offsetX, this.Hair7.offsetY, this.Hair7.offsetZ);
        GL11.glTranslatef(this.Hair7.rotationPointX * f5, this.Hair7.rotationPointY * f5, this.Hair7.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair7.offsetX, -this.Hair7.offsetY, -this.Hair7.offsetZ);
        GL11.glTranslatef(-this.Hair7.rotationPointX * f5, -this.Hair7.rotationPointY * f5, -this.Hair7.rotationPointZ * f5);
        this.Hair7.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair5.offsetX, this.Hair5.offsetY, this.Hair5.offsetZ);
        GL11.glTranslatef(this.Hair5.rotationPointX * f5, this.Hair5.rotationPointY * f5, this.Hair5.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair5.offsetX, -this.Hair5.offsetY, -this.Hair5.offsetZ);
        GL11.glTranslatef(-this.Hair5.rotationPointX * f5, -this.Hair5.rotationPointY * f5, -this.Hair5.rotationPointZ * f5);
        this.Hair5.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair15.offsetX, this.Hair15.offsetY, this.Hair15.offsetZ);
        GL11.glTranslatef(this.Hair15.rotationPointX * f5, this.Hair15.rotationPointY * f5, this.Hair15.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair15.offsetX, -this.Hair15.offsetY, -this.Hair15.offsetZ);
        GL11.glTranslatef(-this.Hair15.rotationPointX * f5, -this.Hair15.rotationPointY * f5, -this.Hair15.rotationPointZ * f5);
        this.Hair15.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair9.offsetX, this.Hair9.offsetY, this.Hair9.offsetZ);
        GL11.glTranslatef(this.Hair9.rotationPointX * f5, this.Hair9.rotationPointY * f5, this.Hair9.rotationPointZ * f5);
        GL11.glScaled(0.4D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Hair9.offsetX, -this.Hair9.offsetY, -this.Hair9.offsetZ);
        GL11.glTranslatef(-this.Hair9.rotationPointX * f5, -this.Hair9.rotationPointY * f5, -this.Hair9.rotationPointZ * f5);
        this.Hair9.render(f5);
        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
