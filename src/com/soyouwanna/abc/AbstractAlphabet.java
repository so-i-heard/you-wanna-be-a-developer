package com.soyouwanna.abc;

public abstract class AbstractAlphabet {

	public int base;
	
	public String[] space;
	public String[] a;
	public String[] b;
	public String[] c;
	public String[] d;
	public String[] e;
	public String[] f;
	public String[] g;
	public String[] h;
	public String[] i;
	public String[] j;
	public String[] k;
	public String[] l;
	public String[] m;
	public String[] n;
	public String[] o;
	public String[] p;
	public String[] q;
	public String[] r;
	public String[] s;
	public String[] t;
	public String[] u;
	public String[] v;
	public String[] w;
	public String[] x;
	public String[] y;
	public String[] z;

	public AbstractAlphabet() {
	}

   public String[] getAsciiFormOfLetter(char letter) {
		String[] toReturn;
		
		switch(letter){
		case ' ':	toReturn = space;
					break;
		case 'a':	toReturn = a;
					break;
		case 'b':	toReturn = b;
					break;
		case 'c':	toReturn = c;
					break;
		case 'd':	toReturn = d;
					break;
		case 'e':	toReturn = e;
					break;
		case 'f':	toReturn = f;
					break;
		case 'g':	toReturn = g;
					break;
		case 'h':	toReturn = h;
					break;
		case 'i':	toReturn = i;
					break;
		case 'j': 	toReturn = j;
					break;
		case 'k':	toReturn = k;
					break;
		case 'l':	toReturn = l;
					break;
		case 'm':	toReturn = m;
					break;
		case 'n':	toReturn = n;
					break;
		case 'o':	toReturn = o;
					break;
		case 'p':	toReturn = p;
					break;
		case 'q':	toReturn = q;
					break;
		case 'r':	toReturn = r;
					break;
		case 's':	toReturn = s;
					break;
		case 't':	toReturn = t;
					break;
		case 'u':	toReturn = u;
					break;
		case 'v':	toReturn = v;
					break;
		case 'w':	toReturn = w;
					break;
		case 'x':	toReturn = x;
					break;
		case 'y':	toReturn = y;
					break;
		case 'z':	toReturn = z;
					break;
		default:	toReturn = space;
					break;
		}
		return toReturn;
	}

}
