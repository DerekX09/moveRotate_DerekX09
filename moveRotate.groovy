//Move and rotate opperations
double size =40;
CSG cube = new Cube(size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
		
//cubeIntersectSphere = cubeIntersectSphere.move(x,y,z);// vector notation
CSG movedCube = cube
			.movex(10)
			.movey(20)
			.movez(30)
//rotate
//cubeIntersectSphere = cubeIntersectSphere.rot(rx,ry,rz);// vector notation
movedCube = movedCube
			.rotx(15)
			.roty(20)
			.rotz(30)
//set colors
cube.setColor(javafx.scene.paint.Color.CYAN);

return [cube,movedCube]