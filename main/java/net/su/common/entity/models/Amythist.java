
package net.su.common.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

/**
 * Amethyst.tcn - TechneToTabulaImporter
 * Created using Tabula 4.1.1
 */
public class Amythist extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer rightarm;
    public ModelRenderer leftarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer nose;
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
    public ModelRenderer Hair18_1;
    public ModelRenderer Hair19_1;
    public ModelRenderer Hair20;
    public ModelRenderer Hair21;
    public ModelRenderer Hair22;
    public ModelRenderer Hair23;
    public ModelRenderer Hair24;
    public ModelRenderer Hair25;
    public ModelRenderer Hair26;
    public ModelRenderer Hair27;
    public ModelRenderer body1;
    public ModelRenderer rightlegback;
    public ModelRenderer leftlegback;
    public ModelRenderer rightleg2;
    public ModelRenderer leftleg2;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer rightleg_1;
    public ModelRenderer leftleg_1;
    public ModelRenderer body4;
    public ModelRenderer body5;

    public Amythist() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Hair14 = new ModelRenderer(this, 74, 51);
        this.Hair14.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair14.addBox(-4.400000095367432F, -6.866666793823242F, -2.5333333015441895F, 1, 6, 7, 0.0F);
        this.body4 = new ModelRenderer(this, 17, 74);
        this.body4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body4.addBox(-3.0F, 1.0F, -2.0F, 6, 10, 4, 0.0F);
        this.setRotateAngle(body4, 1.2392125841442283E-31F, -1.5373221829213964E-16F, -8.060851511225409E-16F);
        this.Hair17 = new ModelRenderer(this, 74, 51);
        this.Hair17.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair17.addBox(-4.400000095367432F, -8.866666793823242F, -4.066666603088379F, 1, 4, 8, 0.0F);
        this.head = new ModelRenderer(this, 74, 51);
        this.head.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.head.addBox(-4.866666793823242F, -0.8666666746139526F, 3.4666666984558105F, 2, 1, 1, 0.0F);
        this.Hair1 = new ModelRenderer(this, 74, 51);
        this.Hair1.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair1.addBox(-3.5999999046325684F, 12.466666221618652F, 2.4666666984558105F, 7, 5, 2, 0.0F);
        this.Hair18 = new ModelRenderer(this, 74, 51);
        this.Hair18.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair18.addBox(4.0F, 14.133333206176758F, 3.4666666984558105F, 2, 1, 1, 0.0F);
        this.body5 = new ModelRenderer(this, 16, 74);
        this.body5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body5.addBox(-3.5999999046325684F, 1.0F, -2.0F, 1, 10, 4, 0.0F);
        this.setRotateAngle(body5, 1.2392125841442283E-31F, -1.5373221829213964E-16F, -8.060851511225409E-16F);
        this.leftleg = new ModelRenderer(this, 0, 89);
        this.leftleg.mirror = true;
        this.leftleg.setRotationPoint(2.0F, 15.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 8.0F, -2.200000047683716F, 4, 1, 1, 0.0F);
        this.setRotateAngle(leftleg, -1.0541113270342954E-15F, -0.0F, 0.0F);
        this.Hair5 = new ModelRenderer(this, 74, 51);
        this.Hair5.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair5.addBox(-4.400000095367432F, -7.866666793823242F, -4.5333333015441895F, 1, 5, 9, 0.0F);
        this.Hair26 = new ModelRenderer(this, 0, 58);
        this.Hair26.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair26.addBox(-4.0F, -8.466666221618652F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(Hair26, 0.0F, -2.480262023815341E-16F, 0.0F);
        this.Hair9 = new ModelRenderer(this, 74, 51);
        this.Hair9.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair9.addBox(-4.0F, -8.533333778381348F, -4.5333333015441895F, 8, 2, 1, 0.0F);
        this.Hair2 = new ModelRenderer(this, 74, 51);
        this.Hair2.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair2.addBox(-4.266666889190674F, -1.5333333015441895F, 2.4666666984558105F, 3, 13, 2, 0.0F);
        this.Hair23 = new ModelRenderer(this, 74, 51);
        this.Hair23.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair23.addBox(-5.0F, 3.866666555404663F, 2.4666666984558105F, 10, 13, 2, 0.0F);
        this.body1 = new ModelRenderer(this, 16, 74);
        this.body1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body1.addBox(2.5999999046325684F, 1.0F, -2.0F, 1, 10, 4, 0.0F);
        this.setRotateAngle(body1, 1.2392125841442283E-31F, -1.5373221829213964E-16F, -8.060851511225409E-16F);
        this.Hair3 = new ModelRenderer(this, 74, 51);
        this.Hair3.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair3.addBox(1.2000000476837158F, 17.600000381469727F, 3.4666666984558105F, 1, 1, 1, 0.0F);
        this.Hair7 = new ModelRenderer(this, 74, 51);
        this.Hair7.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair7.addBox(-1.6666666269302368F, -6.5333333015441895F, -4.5333333015441895F, 4, 1, 1, 0.0F);
        this.Hair4 = new ModelRenderer(this, 74, 51);
        this.Hair4.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair4.addBox(-6.066666603088379F, 9.133333206176758F, 3.4666666984558105F, 2, 1, 1, 0.0F);
        this.Hair22 = new ModelRenderer(this, 74, 51);
        this.Hair22.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair22.addBox(-4.0F, -8.866666793823242F, -4.5333333015441895F, 8, 1, 9, 0.0F);
        this.rightlegback = new ModelRenderer(this, 41, 103);
        this.rightlegback.setRotationPoint(-2.0F, 15.0F, 0.0F);
        this.rightlegback.addBox(-2.0F, -1.0F, -0.800000011920929F, 4, 3, 3, 0.0F);
        this.Hair18_1 = new ModelRenderer(this, 74, 51);
        this.Hair18_1.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair18_1.addBox(0.4000000059604645F, 5.866666793823242F, 2.4666666984558105F, 5, 10, 2, 0.0F);
        this.Hair19_1 = new ModelRenderer(this, 74, 51);
        this.Hair19_1.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair19_1.addBox(2.9000000953674316F, -2.866666555404663F, 3.4666666984558105F, 2, 1, 1, 0.0F);
        this.body2 = new ModelRenderer(this, 39, 59);
        this.body2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body2.addBox(-4.0F, 1.2666666507720947F, -2.4000000953674316F, 8, 5, 5, 0.0F);
        this.rightleg_1 = new ModelRenderer(this, 0, 74);
        this.rightleg_1.setRotationPoint(-2.0F, 15.0F, 0.0F);
        this.rightleg_1.addBox(-2.0F, -1.0F, -2.0F, 4, 10, 4, 0.0F);
        this.Hair8 = new ModelRenderer(this, 74, 51);
        this.Hair8.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair8.addBox(0.0F, -5.5333333015441895F, -4.5333333015441895F, 3, 1, 1, 0.0F);
        this.Hair11 = new ModelRenderer(this, 74, 51);
        this.Hair11.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair11.addBox(1.0F, -7.5333333015441895F, -4.5333333015441895F, 3, 4, 1, 0.0F);
        this.setRotateAngle(Hair11, 0.0F, -2.480262023815341E-16F, 0.0F);
        this.Hair20 = new ModelRenderer(this, 74, 51);
        this.Hair20.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair20.addBox(1.9333332777023315F, -8.199999809265137F, -4.5333333015441895F, 1, 5, 1, 0.0F);
        this.Hair25 = new ModelRenderer(this, 74, 51);
        this.Hair25.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair25.addBox(1.0F, 17.133333206176758F, 3.4666666984558105F, 2, 1, 1, 0.0F);
        this.leftlegback = new ModelRenderer(this, 41, 103);
        this.leftlegback.mirror = true;
        this.leftlegback.setRotationPoint(2.0F, 15.0F, 0.0F);
        this.leftlegback.addBox(-2.0F, -1.0F, -0.800000011920929F, 4, 3, 3, 0.0F);
        this.setRotateAngle(leftlegback, -1.5695408280756672E-15F, -0.0F, 0.0F);
        this.nose = new ModelRenderer(this, 22, 74);
        this.nose.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.nose.addBox(-0.6000000238418579F, -3.4666666984558105F, -4.133333206176758F, 1, 1, 1, 0.0F);
        this.setRotateAngle(nose, 0.0F, -2.480262023815341E-16F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 5, 99);
        this.rightleg2.setRotationPoint(-2.0F, 15.0F, 0.0F);
        this.rightleg2.addBox(0.0F, -1.0F, -2.4666666984558105F, 2, 1, 4, 0.0F);
        this.Hair12 = new ModelRenderer(this, 74, 51);
        this.Hair12.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair12.addBox(-4.0F, -9.399999618530273F, -4.099999904632568F, 8, 1, 8, 0.0F);
        this.Hair10 = new ModelRenderer(this, 74, 51);
        this.Hair10.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair10.addBox(-4.0F, -8.533333778381348F, 2.4666666984558105F, 8, 10, 2, 0.0F);
        this.Hair13 = new ModelRenderer(this, 74, 53);
        this.Hair13.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair13.addBox(-4.400000095367432F, -3.866666555404663F, -3.5333333015441895F, 1, 2, 2, 0.0F);
        this.Hair24 = new ModelRenderer(this, 74, 51);
        this.Hair24.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair24.addBox(-5.333333492279053F, 5.866666793823242F, 2.4666666984558105F, 5, 10, 2, 0.0F);
        this.body3 = new ModelRenderer(this, 39, 50);
        this.body3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body3.addBox(-4.0F, 8.0F, -2.4000000953674316F, 8, 3, 5, 0.0F);
        this.Hair21 = new ModelRenderer(this, 74, 51);
        this.Hair21.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair21.addBox(3.3333332538604736F, -8.866666793823242F, -4.066666603088379F, 1, 4, 8, 0.0F);
        this.Hair16 = new ModelRenderer(this, 74, 51);
        this.Hair16.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair16.addBox(3.3333332538604736F, -6.866666793823242F, -2.5333333015441895F, 1, 6, 7, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 89);
        this.rightleg.setRotationPoint(-2.0F, 15.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 8.0F, -2.200000047683716F, 4, 1, 1, 0.0F);
        this.leftleg_1 = new ModelRenderer(this, 0, 74);
        this.leftleg_1.mirror = true;
        this.leftleg_1.setRotationPoint(2.0F, 15.0F, 0.0F);
        this.leftleg_1.addBox(-2.0F, -1.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(leftleg_1, -1.5695408280756672E-15F, -0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 5, 99);
        this.leftleg2.mirror = true;
        this.leftleg2.setRotationPoint(2.0F, 15.0F, 0.0F);
        this.leftleg2.addBox(-2.0F, -1.0F, -2.4666666984558105F, 2, 1, 4, 0.0F);
        this.setRotateAngle(leftleg2, -1.5695408280756672E-15F, -0.0F, 0.0F);
        this.Hair15 = new ModelRenderer(this, 74, 53);
        this.Hair15.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair15.addBox(3.3333332538604736F, -3.866666555404663F, -3.5333333015441895F, 1, 2, 2, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 74);
        this.rightarm.setRotationPoint(-5.0F, 4.0F, 0.0F);
        this.rightarm.addBox(-3.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(rightarm, 0.0F, -0.0F, -4.650491460089887E-16F);
        this.Hair6 = new ModelRenderer(this, 74, 51);
        this.Hair6.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair6.addBox(-3.5333333015441895F, -7.133333206176758F, -4.5333333015441895F, 1, 2, 1, 0.0F);
        this.Hair19 = new ModelRenderer(this, 74, 51);
        this.Hair19.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair19.addBox(-1.600000023841858F, -1.5333333015441895F, 2.4666666984558105F, 6, 13, 2, 0.0F);
        this.Hair27 = new ModelRenderer(this, 74, 51);
        this.Hair27.setRotationPoint(0.0F, 4.5333333015441895F, 0.0F);
        this.Hair27.addBox(3.3333332538604736F, -7.866666793823242F, -4.5333333015441895F, 1, 5, 9, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 74);
        this.leftarm.setRotationPoint(5.0F, 4.0F, 0.0F);
        this.leftarm.addBox(-1.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    
    	
    	/* Animation Start (Arms) */
    	float prog = 0.1F;
    	
		this.leftarm.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.rightarm.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;


    	/* Animation Start (Legs) */
		

		this.leftleg.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.rightleg.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
		this.leftleg_1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.rightleg_1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	
		this.leftleg_1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightleg_1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
		this.leftleg2.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.rightleg2.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.leftleg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
		this.leftlegback.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.rightlegback.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.leftlegback.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightlegback.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
		
		/* End Animation  */
		
		
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair14.offsetX, this.Hair14.offsetY, this.Hair14.offsetZ);
        GL11.glTranslatef(this.Hair14.rotationPointX * f5, this.Hair14.rotationPointY * f5, this.Hair14.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair14.offsetX, -this.Hair14.offsetY, -this.Hair14.offsetZ);
        GL11.glTranslatef(-this.Hair14.rotationPointX * f5, -this.Hair14.rotationPointY * f5, -this.Hair14.rotationPointZ * f5);
        this.Hair14.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.body4.offsetX, this.body4.offsetY, this.body4.offsetZ);
        GL11.glTranslatef(this.body4.rotationPointX * f5, this.body4.rotationPointY * f5, this.body4.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.body4.offsetX, -this.body4.offsetY, -this.body4.offsetZ);
        GL11.glTranslatef(-this.body4.rotationPointX * f5, -this.body4.rotationPointY * f5, -this.body4.rotationPointZ * f5);
        this.body4.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair17.offsetX, this.Hair17.offsetY, this.Hair17.offsetZ);
        GL11.glTranslatef(this.Hair17.rotationPointX * f5, this.Hair17.rotationPointY * f5, this.Hair17.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair17.offsetX, -this.Hair17.offsetY, -this.Hair17.offsetZ);
        GL11.glTranslatef(-this.Hair17.rotationPointX * f5, -this.Hair17.rotationPointY * f5, -this.Hair17.rotationPointZ * f5);
        this.Hair17.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.head.offsetX, this.head.offsetY, this.head.offsetZ);
        GL11.glTranslatef(this.head.rotationPointX * f5, this.head.rotationPointY * f5, this.head.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.head.offsetX, -this.head.offsetY, -this.head.offsetZ);
        GL11.glTranslatef(-this.head.rotationPointX * f5, -this.head.rotationPointY * f5, -this.head.rotationPointZ * f5);
        this.head.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair1.offsetX, this.Hair1.offsetY, this.Hair1.offsetZ);
        GL11.glTranslatef(this.Hair1.rotationPointX * f5, this.Hair1.rotationPointY * f5, this.Hair1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair1.offsetX, -this.Hair1.offsetY, -this.Hair1.offsetZ);
        GL11.glTranslatef(-this.Hair1.rotationPointX * f5, -this.Hair1.rotationPointY * f5, -this.Hair1.rotationPointZ * f5);
        this.Hair1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair18.offsetX, this.Hair18.offsetY, this.Hair18.offsetZ);
        GL11.glTranslatef(this.Hair18.rotationPointX * f5, this.Hair18.rotationPointY * f5, this.Hair18.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair18.offsetX, -this.Hair18.offsetY, -this.Hair18.offsetZ);
        GL11.glTranslatef(-this.Hair18.rotationPointX * f5, -this.Hair18.rotationPointY * f5, -this.Hair18.rotationPointZ * f5);
        this.Hair18.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.body5.offsetX, this.body5.offsetY, this.body5.offsetZ);
        GL11.glTranslatef(this.body5.rotationPointX * f5, this.body5.rotationPointY * f5, this.body5.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.body5.offsetX, -this.body5.offsetY, -this.body5.offsetZ);
        GL11.glTranslatef(-this.body5.rotationPointX * f5, -this.body5.rotationPointY * f5, -this.body5.rotationPointZ * f5);
        this.body5.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftleg.offsetX, this.leftleg.offsetY, this.leftleg.offsetZ);
        GL11.glTranslatef(this.leftleg.rotationPointX * f5, this.leftleg.rotationPointY * f5, this.leftleg.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.leftleg.offsetX, -this.leftleg.offsetY, -this.leftleg.offsetZ);
        GL11.glTranslatef(-this.leftleg.rotationPointX * f5, -this.leftleg.rotationPointY * f5, -this.leftleg.rotationPointZ * f5);
        this.leftleg.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair5.offsetX, this.Hair5.offsetY, this.Hair5.offsetZ);
        GL11.glTranslatef(this.Hair5.rotationPointX * f5, this.Hair5.rotationPointY * f5, this.Hair5.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair5.offsetX, -this.Hair5.offsetY, -this.Hair5.offsetZ);
        GL11.glTranslatef(-this.Hair5.rotationPointX * f5, -this.Hair5.rotationPointY * f5, -this.Hair5.rotationPointZ * f5);
        this.Hair5.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair26.offsetX, this.Hair26.offsetY, this.Hair26.offsetZ);
        GL11.glTranslatef(this.Hair26.rotationPointX * f5, this.Hair26.rotationPointY * f5, this.Hair26.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair26.offsetX, -this.Hair26.offsetY, -this.Hair26.offsetZ);
        GL11.glTranslatef(-this.Hair26.rotationPointX * f5, -this.Hair26.rotationPointY * f5, -this.Hair26.rotationPointZ * f5);
        this.Hair26.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair9.offsetX, this.Hair9.offsetY, this.Hair9.offsetZ);
        GL11.glTranslatef(this.Hair9.rotationPointX * f5, this.Hair9.rotationPointY * f5, this.Hair9.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair9.offsetX, -this.Hair9.offsetY, -this.Hair9.offsetZ);
        GL11.glTranslatef(-this.Hair9.rotationPointX * f5, -this.Hair9.rotationPointY * f5, -this.Hair9.rotationPointZ * f5);
        this.Hair9.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair2.offsetX, this.Hair2.offsetY, this.Hair2.offsetZ);
        GL11.glTranslatef(this.Hair2.rotationPointX * f5, this.Hair2.rotationPointY * f5, this.Hair2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair2.offsetX, -this.Hair2.offsetY, -this.Hair2.offsetZ);
        GL11.glTranslatef(-this.Hair2.rotationPointX * f5, -this.Hair2.rotationPointY * f5, -this.Hair2.rotationPointZ * f5);
        this.Hair2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair23.offsetX, this.Hair23.offsetY, this.Hair23.offsetZ);
        GL11.glTranslatef(this.Hair23.rotationPointX * f5, this.Hair23.rotationPointY * f5, this.Hair23.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair23.offsetX, -this.Hair23.offsetY, -this.Hair23.offsetZ);
        GL11.glTranslatef(-this.Hair23.rotationPointX * f5, -this.Hair23.rotationPointY * f5, -this.Hair23.rotationPointZ * f5);
        this.Hair23.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.body1.offsetX, this.body1.offsetY, this.body1.offsetZ);
        GL11.glTranslatef(this.body1.rotationPointX * f5, this.body1.rotationPointY * f5, this.body1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.body1.offsetX, -this.body1.offsetY, -this.body1.offsetZ);
        GL11.glTranslatef(-this.body1.rotationPointX * f5, -this.body1.rotationPointY * f5, -this.body1.rotationPointZ * f5);
        this.body1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair3.offsetX, this.Hair3.offsetY, this.Hair3.offsetZ);
        GL11.glTranslatef(this.Hair3.rotationPointX * f5, this.Hair3.rotationPointY * f5, this.Hair3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair3.offsetX, -this.Hair3.offsetY, -this.Hair3.offsetZ);
        GL11.glTranslatef(-this.Hair3.rotationPointX * f5, -this.Hair3.rotationPointY * f5, -this.Hair3.rotationPointZ * f5);
        this.Hair3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair7.offsetX, this.Hair7.offsetY, this.Hair7.offsetZ);
        GL11.glTranslatef(this.Hair7.rotationPointX * f5, this.Hair7.rotationPointY * f5, this.Hair7.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair7.offsetX, -this.Hair7.offsetY, -this.Hair7.offsetZ);
        GL11.glTranslatef(-this.Hair7.rotationPointX * f5, -this.Hair7.rotationPointY * f5, -this.Hair7.rotationPointZ * f5);
        this.Hair7.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair4.offsetX, this.Hair4.offsetY, this.Hair4.offsetZ);
        GL11.glTranslatef(this.Hair4.rotationPointX * f5, this.Hair4.rotationPointY * f5, this.Hair4.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair4.offsetX, -this.Hair4.offsetY, -this.Hair4.offsetZ);
        GL11.glTranslatef(-this.Hair4.rotationPointX * f5, -this.Hair4.rotationPointY * f5, -this.Hair4.rotationPointZ * f5);
        this.Hair4.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair22.offsetX, this.Hair22.offsetY, this.Hair22.offsetZ);
        GL11.glTranslatef(this.Hair22.rotationPointX * f5, this.Hair22.rotationPointY * f5, this.Hair22.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair22.offsetX, -this.Hair22.offsetY, -this.Hair22.offsetZ);
        GL11.glTranslatef(-this.Hair22.rotationPointX * f5, -this.Hair22.rotationPointY * f5, -this.Hair22.rotationPointZ * f5);
        this.Hair22.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightlegback.offsetX, this.rightlegback.offsetY, this.rightlegback.offsetZ);
        GL11.glTranslatef(this.rightlegback.rotationPointX * f5, this.rightlegback.rotationPointY * f5, this.rightlegback.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.rightlegback.offsetX, -this.rightlegback.offsetY, -this.rightlegback.offsetZ);
        GL11.glTranslatef(-this.rightlegback.rotationPointX * f5, -this.rightlegback.rotationPointY * f5, -this.rightlegback.rotationPointZ * f5);
        this.rightlegback.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair18_1.offsetX, this.Hair18_1.offsetY, this.Hair18_1.offsetZ);
        GL11.glTranslatef(this.Hair18_1.rotationPointX * f5, this.Hair18_1.rotationPointY * f5, this.Hair18_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair18_1.offsetX, -this.Hair18_1.offsetY, -this.Hair18_1.offsetZ);
        GL11.glTranslatef(-this.Hair18_1.rotationPointX * f5, -this.Hair18_1.rotationPointY * f5, -this.Hair18_1.rotationPointZ * f5);
        this.Hair18_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair19_1.offsetX, this.Hair19_1.offsetY, this.Hair19_1.offsetZ);
        GL11.glTranslatef(this.Hair19_1.rotationPointX * f5, this.Hair19_1.rotationPointY * f5, this.Hair19_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair19_1.offsetX, -this.Hair19_1.offsetY, -this.Hair19_1.offsetZ);
        GL11.glTranslatef(-this.Hair19_1.rotationPointX * f5, -this.Hair19_1.rotationPointY * f5, -this.Hair19_1.rotationPointZ * f5);
        this.Hair19_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.body2.offsetX, this.body2.offsetY, this.body2.offsetZ);
        GL11.glTranslatef(this.body2.rotationPointX * f5, this.body2.rotationPointY * f5, this.body2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.body2.offsetX, -this.body2.offsetY, -this.body2.offsetZ);
        GL11.glTranslatef(-this.body2.rotationPointX * f5, -this.body2.rotationPointY * f5, -this.body2.rotationPointZ * f5);
        this.body2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightleg_1.offsetX, this.rightleg_1.offsetY, this.rightleg_1.offsetZ);
        GL11.glTranslatef(this.rightleg_1.rotationPointX * f5, this.rightleg_1.rotationPointY * f5, this.rightleg_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.rightleg_1.offsetX, -this.rightleg_1.offsetY, -this.rightleg_1.offsetZ);
        GL11.glTranslatef(-this.rightleg_1.rotationPointX * f5, -this.rightleg_1.rotationPointY * f5, -this.rightleg_1.rotationPointZ * f5);
        this.rightleg_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair8.offsetX, this.Hair8.offsetY, this.Hair8.offsetZ);
        GL11.glTranslatef(this.Hair8.rotationPointX * f5, this.Hair8.rotationPointY * f5, this.Hair8.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair8.offsetX, -this.Hair8.offsetY, -this.Hair8.offsetZ);
        GL11.glTranslatef(-this.Hair8.rotationPointX * f5, -this.Hair8.rotationPointY * f5, -this.Hair8.rotationPointZ * f5);
        this.Hair8.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair11.offsetX, this.Hair11.offsetY, this.Hair11.offsetZ);
        GL11.glTranslatef(this.Hair11.rotationPointX * f5, this.Hair11.rotationPointY * f5, this.Hair11.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair11.offsetX, -this.Hair11.offsetY, -this.Hair11.offsetZ);
        GL11.glTranslatef(-this.Hair11.rotationPointX * f5, -this.Hair11.rotationPointY * f5, -this.Hair11.rotationPointZ * f5);
        this.Hair11.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair20.offsetX, this.Hair20.offsetY, this.Hair20.offsetZ);
        GL11.glTranslatef(this.Hair20.rotationPointX * f5, this.Hair20.rotationPointY * f5, this.Hair20.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair20.offsetX, -this.Hair20.offsetY, -this.Hair20.offsetZ);
        GL11.glTranslatef(-this.Hair20.rotationPointX * f5, -this.Hair20.rotationPointY * f5, -this.Hair20.rotationPointZ * f5);
        this.Hair20.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair25.offsetX, this.Hair25.offsetY, this.Hair25.offsetZ);
        GL11.glTranslatef(this.Hair25.rotationPointX * f5, this.Hair25.rotationPointY * f5, this.Hair25.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair25.offsetX, -this.Hair25.offsetY, -this.Hair25.offsetZ);
        GL11.glTranslatef(-this.Hair25.rotationPointX * f5, -this.Hair25.rotationPointY * f5, -this.Hair25.rotationPointZ * f5);
        this.Hair25.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftlegback.offsetX, this.leftlegback.offsetY, this.leftlegback.offsetZ);
        GL11.glTranslatef(this.leftlegback.rotationPointX * f5, this.leftlegback.rotationPointY * f5, this.leftlegback.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.leftlegback.offsetX, -this.leftlegback.offsetY, -this.leftlegback.offsetZ);
        GL11.glTranslatef(-this.leftlegback.rotationPointX * f5, -this.leftlegback.rotationPointY * f5, -this.leftlegback.rotationPointZ * f5);
        this.leftlegback.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.nose.offsetX, this.nose.offsetY, this.nose.offsetZ);
        GL11.glTranslatef(this.nose.rotationPointX * f5, this.nose.rotationPointY * f5, this.nose.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.nose.offsetX, -this.nose.offsetY, -this.nose.offsetZ);
        GL11.glTranslatef(-this.nose.rotationPointX * f5, -this.nose.rotationPointY * f5, -this.nose.rotationPointZ * f5);
        this.nose.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightleg2.offsetX, this.rightleg2.offsetY, this.rightleg2.offsetZ);
        GL11.glTranslatef(this.rightleg2.rotationPointX * f5, this.rightleg2.rotationPointY * f5, this.rightleg2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.rightleg2.offsetX, -this.rightleg2.offsetY, -this.rightleg2.offsetZ);
        GL11.glTranslatef(-this.rightleg2.rotationPointX * f5, -this.rightleg2.rotationPointY * f5, -this.rightleg2.rotationPointZ * f5);
        this.rightleg2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair12.offsetX, this.Hair12.offsetY, this.Hair12.offsetZ);
        GL11.glTranslatef(this.Hair12.rotationPointX * f5, this.Hair12.rotationPointY * f5, this.Hair12.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair12.offsetX, -this.Hair12.offsetY, -this.Hair12.offsetZ);
        GL11.glTranslatef(-this.Hair12.rotationPointX * f5, -this.Hair12.rotationPointY * f5, -this.Hair12.rotationPointZ * f5);
        this.Hair12.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair10.offsetX, this.Hair10.offsetY, this.Hair10.offsetZ);
        GL11.glTranslatef(this.Hair10.rotationPointX * f5, this.Hair10.rotationPointY * f5, this.Hair10.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair10.offsetX, -this.Hair10.offsetY, -this.Hair10.offsetZ);
        GL11.glTranslatef(-this.Hair10.rotationPointX * f5, -this.Hair10.rotationPointY * f5, -this.Hair10.rotationPointZ * f5);
        this.Hair10.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair13.offsetX, this.Hair13.offsetY, this.Hair13.offsetZ);
        GL11.glTranslatef(this.Hair13.rotationPointX * f5, this.Hair13.rotationPointY * f5, this.Hair13.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair13.offsetX, -this.Hair13.offsetY, -this.Hair13.offsetZ);
        GL11.glTranslatef(-this.Hair13.rotationPointX * f5, -this.Hair13.rotationPointY * f5, -this.Hair13.rotationPointZ * f5);
        this.Hair13.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair24.offsetX, this.Hair24.offsetY, this.Hair24.offsetZ);
        GL11.glTranslatef(this.Hair24.rotationPointX * f5, this.Hair24.rotationPointY * f5, this.Hair24.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair24.offsetX, -this.Hair24.offsetY, -this.Hair24.offsetZ);
        GL11.glTranslatef(-this.Hair24.rotationPointX * f5, -this.Hair24.rotationPointY * f5, -this.Hair24.rotationPointZ * f5);
        this.Hair24.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.body3.offsetX, this.body3.offsetY, this.body3.offsetZ);
        GL11.glTranslatef(this.body3.rotationPointX * f5, this.body3.rotationPointY * f5, this.body3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.body3.offsetX, -this.body3.offsetY, -this.body3.offsetZ);
        GL11.glTranslatef(-this.body3.rotationPointX * f5, -this.body3.rotationPointY * f5, -this.body3.rotationPointZ * f5);
        this.body3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair21.offsetX, this.Hair21.offsetY, this.Hair21.offsetZ);
        GL11.glTranslatef(this.Hair21.rotationPointX * f5, this.Hair21.rotationPointY * f5, this.Hair21.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair21.offsetX, -this.Hair21.offsetY, -this.Hair21.offsetZ);
        GL11.glTranslatef(-this.Hair21.rotationPointX * f5, -this.Hair21.rotationPointY * f5, -this.Hair21.rotationPointZ * f5);
        this.Hair21.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair16.offsetX, this.Hair16.offsetY, this.Hair16.offsetZ);
        GL11.glTranslatef(this.Hair16.rotationPointX * f5, this.Hair16.rotationPointY * f5, this.Hair16.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair16.offsetX, -this.Hair16.offsetY, -this.Hair16.offsetZ);
        GL11.glTranslatef(-this.Hair16.rotationPointX * f5, -this.Hair16.rotationPointY * f5, -this.Hair16.rotationPointZ * f5);
        this.Hair16.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightleg.offsetX, this.rightleg.offsetY, this.rightleg.offsetZ);
        GL11.glTranslatef(this.rightleg.rotationPointX * f5, this.rightleg.rotationPointY * f5, this.rightleg.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.rightleg.offsetX, -this.rightleg.offsetY, -this.rightleg.offsetZ);
        GL11.glTranslatef(-this.rightleg.rotationPointX * f5, -this.rightleg.rotationPointY * f5, -this.rightleg.rotationPointZ * f5);
        this.rightleg.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftleg_1.offsetX, this.leftleg_1.offsetY, this.leftleg_1.offsetZ);
        GL11.glTranslatef(this.leftleg_1.rotationPointX * f5, this.leftleg_1.rotationPointY * f5, this.leftleg_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.leftleg_1.offsetX, -this.leftleg_1.offsetY, -this.leftleg_1.offsetZ);
        GL11.glTranslatef(-this.leftleg_1.rotationPointX * f5, -this.leftleg_1.rotationPointY * f5, -this.leftleg_1.rotationPointZ * f5);
        this.leftleg_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftleg2.offsetX, this.leftleg2.offsetY, this.leftleg2.offsetZ);
        GL11.glTranslatef(this.leftleg2.rotationPointX * f5, this.leftleg2.rotationPointY * f5, this.leftleg2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.leftleg2.offsetX, -this.leftleg2.offsetY, -this.leftleg2.offsetZ);
        GL11.glTranslatef(-this.leftleg2.rotationPointX * f5, -this.leftleg2.rotationPointY * f5, -this.leftleg2.rotationPointZ * f5);
        this.leftleg2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair15.offsetX, this.Hair15.offsetY, this.Hair15.offsetZ);
        GL11.glTranslatef(this.Hair15.rotationPointX * f5, this.Hair15.rotationPointY * f5, this.Hair15.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair15.offsetX, -this.Hair15.offsetY, -this.Hair15.offsetZ);
        GL11.glTranslatef(-this.Hair15.rotationPointX * f5, -this.Hair15.rotationPointY * f5, -this.Hair15.rotationPointZ * f5);
        this.Hair15.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightarm.offsetX, this.rightarm.offsetY, this.rightarm.offsetZ);
        GL11.glTranslatef(this.rightarm.rotationPointX * f5, this.rightarm.rotationPointY * f5, this.rightarm.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.rightarm.offsetX, -this.rightarm.offsetY, -this.rightarm.offsetZ);
        GL11.glTranslatef(-this.rightarm.rotationPointX * f5, -this.rightarm.rotationPointY * f5, -this.rightarm.rotationPointZ * f5);
        this.rightarm.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair6.offsetX, this.Hair6.offsetY, this.Hair6.offsetZ);
        GL11.glTranslatef(this.Hair6.rotationPointX * f5, this.Hair6.rotationPointY * f5, this.Hair6.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair6.offsetX, -this.Hair6.offsetY, -this.Hair6.offsetZ);
        GL11.glTranslatef(-this.Hair6.rotationPointX * f5, -this.Hair6.rotationPointY * f5, -this.Hair6.rotationPointZ * f5);
        this.Hair6.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair19.offsetX, this.Hair19.offsetY, this.Hair19.offsetZ);
        GL11.glTranslatef(this.Hair19.rotationPointX * f5, this.Hair19.rotationPointY * f5, this.Hair19.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair19.offsetX, -this.Hair19.offsetY, -this.Hair19.offsetZ);
        GL11.glTranslatef(-this.Hair19.rotationPointX * f5, -this.Hair19.rotationPointY * f5, -this.Hair19.rotationPointZ * f5);
        this.Hair19.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hair27.offsetX, this.Hair27.offsetY, this.Hair27.offsetZ);
        GL11.glTranslatef(this.Hair27.rotationPointX * f5, this.Hair27.rotationPointY * f5, this.Hair27.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.Hair27.offsetX, -this.Hair27.offsetY, -this.Hair27.offsetZ);
        GL11.glTranslatef(-this.Hair27.rotationPointX * f5, -this.Hair27.rotationPointY * f5, -this.Hair27.rotationPointZ * f5);
        this.Hair27.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftarm.offsetX, this.leftarm.offsetY, this.leftarm.offsetZ);
        GL11.glTranslatef(this.leftarm.rotationPointX * f5, this.leftarm.rotationPointY * f5, this.leftarm.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.100000023841858D);
        GL11.glTranslatef(-this.leftarm.offsetX, -this.leftarm.offsetY, -this.leftarm.offsetZ);
        GL11.glTranslatef(-this.leftarm.rotationPointX * f5, -this.leftarm.rotationPointY * f5, -this.leftarm.rotationPointZ * f5);
        this.leftarm.render(f5);
        GL11.glPopMatrix();
    }

    @Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		//ModelBiped
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		//    this.legLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
	
	}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
	public void render() 
	{
		

	}
}
