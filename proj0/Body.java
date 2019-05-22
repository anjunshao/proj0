public class Body{

		double xxPos;
		double yyPos;
		double xxVel;
		double yyVel;
		double mass;
		String imgFileName;

		public Body(double xP, double yP, double xV,
		double yV, double m, String img){
			xxPos = xP;
			yyPos = yP;
			xxVel = xV;
			yyVel = yV;
			mass = m;
			imgFileName = img; 
		}
	public Body (Body b){
		xxPos = b.xxPos;
		yyPos = b.yyPos;
		xxVel = b.xxVel;
		yyVel = b.yyVel;
		mass = b.mass;
		imgFileName = b.imgFileName;
	}
	  public double calcDistance(Body b){
		double dx = xxPos-b.xxPos;
		double dy = yyPos - b.yyPos;
		double r = Math.sqrt(dx*dx + dy*dy);
		return r;
	}
	public double calcForceExertedBy(Body b){
		double G = 6.67e-11;
		double r = calcDistance(b);
		double Force = G*mass*b.mass/r/r;
		return Force;
	}
	public double calcForceExertedByX(Body b){
		double dx = b.xxPos-xxPos;
		double r = calcDistance(b);
		double force = calcForceExertedBy(b);
		double ForceByX = force*dx/r;
		return ForceByX;
	}
	public double calcForceExertedByY(Body b){
		double dy = b.yyPos-yyPos;
		double r = calcDistance(b);
		double force = calcForceExertedBy( b);
		double ForceByY = force*dy/r;
		return ForceByY;
	}

	}
