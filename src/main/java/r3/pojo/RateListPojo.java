package r3.pojo;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RateListPojo {
	
	@JsonProperty("USD")
	private Integer usd;
	@JsonProperty("AED")
	private double aed;
	@JsonProperty("AFN")
	private double afn;
	@JsonProperty("ALL")
	private double all;
	@JsonProperty("AMD")
	private double amd;
	@JsonProperty("ANG")
	private double ang;
	@JsonProperty("AOA")
	private double aoa;
	@JsonProperty("ARS")
	private double ars;
	@JsonProperty("AUD")
	private double aud;
	@JsonProperty("AWG")
	private double awg;
	@JsonProperty("AZN")
	private double azn;
	@JsonProperty("BAM")
	private double bam;
	@JsonProperty("BBD")
	private double bbd;
	@JsonProperty("BDT")
	private double bdt;
	@JsonProperty("BGN")
	private double bgn;
	@JsonProperty("BHD")
	private double bhd;
	@JsonProperty("BIF")
	private double bif;
	@JsonProperty("BMD")
	private double bmd;
	@JsonProperty("BND")
	private double bnd;
	@JsonProperty("BOB")
	private double bob;
	@JsonProperty("BRL")
	private double brl;
	@JsonProperty("BSD")
	private double bsd;
	@JsonProperty("BTN")
	private double btn;
	@JsonProperty("BWP")
	private double bwp;
	@JsonProperty("BYN")
	private double byn;
	@JsonProperty("BZD")
	private double bzd;
	@JsonProperty("CAD")
	private double cad;
	@JsonProperty("CDF")
	private double cdf;
	@JsonProperty("CHF")
	private double chf;	
	@JsonProperty("CLP")
	private double clp;
	@JsonProperty("CNY")
	private double cny;
	@JsonProperty("COP")
	private double cop;
	@JsonProperty("CRC")
	private double crc;
	@JsonProperty("CUP")
	private double cup;
	@JsonProperty("CVE")
	private double cve;
	@JsonProperty("CZK")
	private double czk;
	@JsonProperty("DJF")
	private double djf;
	@JsonProperty("DKK")
	private double dkk;
	@JsonProperty("DOP")
	private double dop;
	@JsonProperty("DZD")
	private double dzd;
	@JsonProperty("EGP")
	private double egp;
	@JsonProperty("ERN")
	private double ern;
	@JsonProperty("ETB")
	private double etb;
	@JsonProperty("EUR")
	private double eur;
	@JsonProperty("FJD")
	private double fjd;
	@JsonProperty("FKP")
	private double fkp;
	@JsonProperty("FOK")
	private double fok;
	@JsonProperty("GBP")
	private double gbp;
	@JsonProperty("GEL")
	private double gel;
	@JsonProperty("GGP")
	private double ggp;
	@JsonProperty("GHS")
	private double ghs;
	@JsonProperty("GIP")
	private double gip;
	@JsonProperty("GMD")
	private double gmd;
	@JsonProperty("GNF")
	private double gnf;
	@JsonProperty("GTQ")
	private double gtq;
	@JsonProperty("GYD")
	private double gyd;
	@JsonProperty("HKD")
	private double hkd;
	@JsonProperty("HNL")
	private double hnl;	
	@JsonProperty("HRK")
	private double hrk;
	@JsonProperty("HTG")
	private double htg;
	@JsonProperty("HUF")
	private double huf;
	@JsonProperty("IDR")
	private double idr;
	@JsonProperty("ILS")
	private double ils;
	@JsonProperty("IMP")
	private double imp;
	@JsonProperty("INR")
	private double inr;
	@JsonProperty("IQD")
	private double iqd;
	@JsonProperty("IRR")
	private double irr;
	@JsonProperty("ISK")
	private double isk;
	@JsonProperty("JEP")
	private double jep;
	@JsonProperty("JMD")
	private double jmd;
	@JsonProperty("JOD")
	private double jod;
	@JsonProperty("JPY")
	private double jpy;
	@JsonProperty("KES")
	private double kes;
	@JsonProperty("KGS")
	private double kgs;
	@JsonProperty("KHR")
	private double khr;
	@JsonProperty("KID")
	private double kid;
	@JsonProperty("KMF")
	private double kmf;
	@JsonProperty("KRW")
	private double krw;
	@JsonProperty("KWD")
	private double kwd;
	@JsonProperty("KYD")
	private double kyd;
	@JsonProperty("KZT")
	private double kzt;
	@JsonProperty("LAK")
	private double lak;
	@JsonProperty("LBP")
	private double lbp;
	@JsonProperty("LKR")
	private double lkr;
	@JsonProperty("LRD")
	private double lrd;
	@JsonProperty("LSL")
	private double lsl;
	@JsonProperty("LYD")
	private double lyd;	
	@JsonProperty("MAD")
	private double mad;
	@JsonProperty("MDL")
	private double mdl;
	@JsonProperty("MGA")
	private double mga;
	@JsonProperty("MKD")
	private double mkd;
	@JsonProperty("MMK")
	private double mmk;
	@JsonProperty("MNT")
	private double mnt;
	@JsonProperty("MOP")
	private double mop;
	@JsonProperty("MRU")
	private double mru;
	@JsonProperty("MUR")
	private double mur;
	@JsonProperty("MVR")
	private double mvr;
	@JsonProperty("MWK")
	private double mwk;
	@JsonProperty("MXN")
	private double mxn;
	@JsonProperty("MYR")
	private double myr;
	@JsonProperty("MZN")
	private double mzn;
	@JsonProperty("NAD")
	private double nad;
	@JsonProperty("NGN")
	private double ngn;
	@JsonProperty("NIO")
	private double nio;
	@JsonProperty("NOK")
	private double nok;
	@JsonProperty("NPR")
	private double npr;
	@JsonProperty("NZD")
	private double nzd;
	@JsonProperty("OMR")
	private double omr;
	@JsonProperty("PAB")
	private double pab;
	@JsonProperty("PEN")
	private double pen;
	@JsonProperty("PGK")
	private double pgk;
	@JsonProperty("PHP")
	private double php;
	@JsonProperty("PKR")
	private double pkr;
	@JsonProperty("PLN")
	private double pln;
	@JsonProperty("PYG")
	private double pyg;
	@JsonProperty("QAR")
	private double qar;	
	@JsonProperty("RON")
	private double ron;
	@JsonProperty("RSD")
	private double rsd;
	@JsonProperty("RUB")
	private double rub;
	@JsonProperty("RWF")
	private double rwf;
	@JsonProperty("SAR")
	private double sar;
	@JsonProperty("SBD")
	private double sbd;
	@JsonProperty("SCR")
	private double scr;
	@JsonProperty("SDG")
	private double sdg;
	@JsonProperty("SEK")
	private double sek;
	@JsonProperty("SGD")
	private double sgd;
	@JsonProperty("SHP")
	private double shp;
	@JsonProperty("SLE")
	private double sle;
	@JsonProperty("SLL")
	private double sll;
	@JsonProperty("SOS")
	private double sos;
	@JsonProperty("SRD")
	private double srd;
	@JsonProperty("SSP")
	private double ssp;
	@JsonProperty("STN")
	private double stn;
	@JsonProperty("SYP")
	private double syp;
	@JsonProperty("SZL")
	private double szl;
	@JsonProperty("THB")
	private double thb;
	@JsonProperty("TJS")
	private double tjs;
	@JsonProperty("TMT")
	private double tmt;
	@JsonProperty("TND")
	private double tnd;
	@JsonProperty("TOP")
	private double top;
	
	@JsonProperty("TRY")
	private double _try;
			
	@JsonProperty("TTD")
	private double ttd;
	@JsonProperty("TVD")
	private double tvd;
	@JsonProperty("TWD")
	private double twd;
	@JsonProperty("TZS")
	private double tzs;
	@JsonProperty("UAH")
	private double uah;
	@JsonProperty("UGX")
	private double ugx;
	@JsonProperty("UYU")
	private double uyu;
	@JsonProperty("UZS")
	private double uzs;
	@JsonProperty("VES")
	private double ves;
	@JsonProperty("VND")
	private double vnd;
	@JsonProperty("VUV")
	private double vuv;
	@JsonProperty("WST")
	private double wst;
	@JsonProperty("XAF")
	private double xaf;
	@JsonProperty("XCD")
	private double xcd;
	@JsonProperty("XDR")
	private double xdr;
	@JsonProperty("XOF")
	private double xof;
	@JsonProperty("XPF")
	private double xpf;
	@JsonProperty("YER")
	private double yer;
	@JsonProperty("ZAR")
	private double zar;
	@JsonProperty("ZMW")
	private double zmw;
	@JsonProperty("ZWL")
	private double zwl;
	
	
	public Integer getUsd() {
		return usd;
	}


	public void setUsd(Integer usd) {
		this.usd = usd;
	}


	public double getAed() {
		return aed;
	}


	public void setAed(double aed) {
		this.aed = aed;
	}


	public double getAfn() {
		return afn;
	}


	public void setAfn(double afn) {
		this.afn = afn;
	}


	public double getAll() {
		return all;
	}


	public void setAll(double all) {
		this.all = all;
	}


	public double getAmd() {
		return amd;
	}


	public void setAmd(double amd) {
		this.amd = amd;
	}


	public double getAng() {
		return ang;
	}


	public void setAng(double ang) {
		this.ang = ang;
	}


	public double getAoa() {
		return aoa;
	}


	public void setAoa(double aoa) {
		this.aoa = aoa;
	}


	public double getArs() {
		return ars;
	}


	public void setArs(double ars) {
		this.ars = ars;
	}


	public double getAud() {
		return aud;
	}


	public void setAud(double aud) {
		this.aud = aud;
	}


	public double getAwg() {
		return awg;
	}


	public void setAwg(double awg) {
		this.awg = awg;
	}


	public double getAzn() {
		return azn;
	}


	public void setAzn(double azn) {
		this.azn = azn;
	}


	public double getBam() {
		return bam;
	}


	public void setBam(double bam) {
		this.bam = bam;
	}


	public double getBbd() {
		return bbd;
	}


	public void setBbd(double bbd) {
		this.bbd = bbd;
	}


	public double getBdt() {
		return bdt;
	}


	public void setBdt(double bdt) {
		this.bdt = bdt;
	}


	public double getBgn() {
		return bgn;
	}


	public void setBgn(double bgn) {
		this.bgn = bgn;
	}


	public double getBhd() {
		return bhd;
	}


	public void setBhd(double bhd) {
		this.bhd = bhd;
	}


	public double getBif() {
		return bif;
	}


	public void setBif(double bif) {
		this.bif = bif;
	}


	public double getBmd() {
		return bmd;
	}


	public void setBmd(double bmd) {
		this.bmd = bmd;
	}


	public double getBnd() {
		return bnd;
	}


	public void setBnd(double bnd) {
		this.bnd = bnd;
	}


	public double getBob() {
		return bob;
	}


	public void setBob(double bob) {
		this.bob = bob;
	}


	public double getBrl() {
		return brl;
	}


	public void setBrl(double brl) {
		this.brl = brl;
	}


	public double getBsd() {
		return bsd;
	}


	public void setBsd(double bsd) {
		this.bsd = bsd;
	}


	public double getBtn() {
		return btn;
	}


	public void setBtn(double btn) {
		this.btn = btn;
	}


	public double getBwp() {
		return bwp;
	}


	public void setBwp(double bwp) {
		this.bwp = bwp;
	}


	public double getByn() {
		return byn;
	}


	public void setByn(double byn) {
		this.byn = byn;
	}


	public double getBzd() {
		return bzd;
	}


	public void setBzd(double bzd) {
		this.bzd = bzd;
	}


	public double getCad() {
		return cad;
	}


	public void setCad(double cad) {
		this.cad = cad;
	}


	public double getCdf() {
		return cdf;
	}


	public void setCdf(double cdf) {
		this.cdf = cdf;
	}


	public double getChf() {
		return chf;
	}


	public void setChf(double chf) {
		this.chf = chf;
	}


	public double getClp() {
		return clp;
	}


	public void setClp(double clp) {
		this.clp = clp;
	}


	public double getCny() {
		return cny;
	}


	public void setCny(double cny) {
		this.cny = cny;
	}


	public double getCop() {
		return cop;
	}


	public void setCop(double cop) {
		this.cop = cop;
	}


	public double getCrc() {
		return crc;
	}


	public void setCrc(double crc) {
		this.crc = crc;
	}


	public double getCup() {
		return cup;
	}


	public void setCup(double cup) {
		this.cup = cup;
	}


	public double getCve() {
		return cve;
	}


	public void setCve(double cve) {
		this.cve = cve;
	}


	public double getCzk() {
		return czk;
	}


	public void setCzk(double czk) {
		this.czk = czk;
	}


	public double getDjf() {
		return djf;
	}


	public void setDjf(double djf) {
		this.djf = djf;
	}


	public double getDkk() {
		return dkk;
	}


	public void setDkk(double dkk) {
		this.dkk = dkk;
	}


	public double getDop() {
		return dop;
	}


	public void setDop(double dop) {
		this.dop = dop;
	}


	public double getDzd() {
		return dzd;
	}


	public void setDzd(double dzd) {
		this.dzd = dzd;
	}


	public double getEgp() {
		return egp;
	}


	public void setEgp(double egp) {
		this.egp = egp;
	}


	public double getErn() {
		return ern;
	}


	public void setErn(double ern) {
		this.ern = ern;
	}


	public double getEtb() {
		return etb;
	}


	public void setEtb(double etb) {
		this.etb = etb;
	}


	public double getEur() {
		return eur;
	}


	public void setEur(double eur) {
		this.eur = eur;
	}


	public double getFjd() {
		return fjd;
	}


	public void setFjd(double fjd) {
		this.fjd = fjd;
	}


	public double getFkp() {
		return fkp;
	}


	public void setFkp(double fkp) {
		this.fkp = fkp;
	}


	public double getFok() {
		return fok;
	}


	public void setFok(double fok) {
		this.fok = fok;
	}


	public double getGbp() {
		return gbp;
	}


	public void setGbp(double gbp) {
		this.gbp = gbp;
	}


	public double getGel() {
		return gel;
	}


	public void setGel(double gel) {
		this.gel = gel;
	}


	public double getGgp() {
		return ggp;
	}


	public void setGgp(double ggp) {
		this.ggp = ggp;
	}


	public double getGhs() {
		return ghs;
	}


	public void setGhs(double ghs) {
		this.ghs = ghs;
	}


	public double getGip() {
		return gip;
	}


	public void setGip(double gip) {
		this.gip = gip;
	}


	public double getGmd() {
		return gmd;
	}


	public void setGmd(double gmd) {
		this.gmd = gmd;
	}


	public double getGnf() {
		return gnf;
	}


	public void setGnf(double gnf) {
		this.gnf = gnf;
	}


	public double getGtq() {
		return gtq;
	}


	public void setGtq(double gtq) {
		this.gtq = gtq;
	}


	public double getGyd() {
		return gyd;
	}


	public void setGyd(double gyd) {
		this.gyd = gyd;
	}


	public double getHkd() {
		return hkd;
	}


	public void setHkd(double hkd) {
		this.hkd = hkd;
	}


	public double getHnl() {
		return hnl;
	}


	public void setHnl(double hnl) {
		this.hnl = hnl;
	}


	public double getHrk() {
		return hrk;
	}


	public void setHrk(double hrk) {
		this.hrk = hrk;
	}


	public double getHtg() {
		return htg;
	}


	public void setHtg(double htg) {
		this.htg = htg;
	}


	public double getHuf() {
		return huf;
	}


	public void setHuf(double huf) {
		this.huf = huf;
	}


	public double getIdr() {
		return idr;
	}


	public void setIdr(double idr) {
		this.idr = idr;
	}


	public double getIls() {
		return ils;
	}


	public void setIls(double ils) {
		this.ils = ils;
	}


	public double getImp() {
		return imp;
	}


	public void setImp(double imp) {
		this.imp = imp;
	}


	public double getInr() {
		return inr;
	}


	public void setInr(double inr) {
		this.inr = inr;
	}


	public double getIqd() {
		return iqd;
	}


	public void setIqd(double iqd) {
		this.iqd = iqd;
	}


	public double getIrr() {
		return irr;
	}


	public void setIrr(double irr) {
		this.irr = irr;
	}


	public double getIsk() {
		return isk;
	}


	public void setIsk(double isk) {
		this.isk = isk;
	}


	public double getJep() {
		return jep;
	}


	public void setJep(double jep) {
		this.jep = jep;
	}


	public double getJmd() {
		return jmd;
	}


	public void setJmd(double jmd) {
		this.jmd = jmd;
	}


	public double getJod() {
		return jod;
	}


	public void setJod(double jod) {
		this.jod = jod;
	}


	public double getJpy() {
		return jpy;
	}


	public void setJpy(double jpy) {
		this.jpy = jpy;
	}


	public double getKes() {
		return kes;
	}


	public void setKes(double kes) {
		this.kes = kes;
	}


	public double getKgs() {
		return kgs;
	}


	public void setKgs(double kgs) {
		this.kgs = kgs;
	}


	public double getKhr() {
		return khr;
	}


	public void setKhr(double khr) {
		this.khr = khr;
	}


	public double getKid() {
		return kid;
	}


	public void setKid(double kid) {
		this.kid = kid;
	}


	public double getKmf() {
		return kmf;
	}


	public void setKmf(double kmf) {
		this.kmf = kmf;
	}


	public double getKrw() {
		return krw;
	}


	public void setKrw(double krw) {
		this.krw = krw;
	}


	public double getKwd() {
		return kwd;
	}


	public void setKwd(double kwd) {
		this.kwd = kwd;
	}


	public double getKyd() {
		return kyd;
	}


	public void setKyd(double kyd) {
		this.kyd = kyd;
	}


	public double getKzt() {
		return kzt;
	}


	public void setKzt(double kzt) {
		this.kzt = kzt;
	}


	public double getLak() {
		return lak;
	}


	public void setLak(double lak) {
		this.lak = lak;
	}


	public double getLbp() {
		return lbp;
	}


	public void setLbp(double lbp) {
		this.lbp = lbp;
	}


	public double getLkr() {
		return lkr;
	}


	public void setLkr(double lkr) {
		this.lkr = lkr;
	}


	public double getLrd() {
		return lrd;
	}


	public void setLrd(double lrd) {
		this.lrd = lrd;
	}


	public double getLsl() {
		return lsl;
	}


	public void setLsl(double lsl) {
		this.lsl = lsl;
	}


	public double getLyd() {
		return lyd;
	}


	public void setLyd(double lyd) {
		this.lyd = lyd;
	}


	public double getMad() {
		return mad;
	}


	public void setMad(double mad) {
		this.mad = mad;
	}


	public double getMdl() {
		return mdl;
	}


	public void setMdl(double mdl) {
		this.mdl = mdl;
	}


	public double getMga() {
		return mga;
	}


	public void setMga(double mga) {
		this.mga = mga;
	}


	public double getMkd() {
		return mkd;
	}


	public void setMkd(double mkd) {
		this.mkd = mkd;
	}


	public double getMmk() {
		return mmk;
	}


	public void setMmk(double mmk) {
		this.mmk = mmk;
	}


	public double getMnt() {
		return mnt;
	}


	public void setMnt(double mnt) {
		this.mnt = mnt;
	}


	public double getMop() {
		return mop;
	}


	public void setMop(double mop) {
		this.mop = mop;
	}


	public double getMru() {
		return mru;
	}


	public void setMru(double mru) {
		this.mru = mru;
	}


	public double getMur() {
		return mur;
	}


	public void setMur(double mur) {
		this.mur = mur;
	}


	public double getMvr() {
		return mvr;
	}


	public void setMvr(double mvr) {
		this.mvr = mvr;
	}


	public double getMwk() {
		return mwk;
	}


	public void setMwk(double mwk) {
		this.mwk = mwk;
	}


	public double getMxn() {
		return mxn;
	}


	public void setMxn(double mxn) {
		this.mxn = mxn;
	}


	public double getMyr() {
		return myr;
	}


	public void setMyr(double myr) {
		this.myr = myr;
	}


	public double getMzn() {
		return mzn;
	}


	public void setMzn(double mzn) {
		this.mzn = mzn;
	}


	public double getNad() {
		return nad;
	}


	public void setNad(double nad) {
		this.nad = nad;
	}


	public double getNgn() {
		return ngn;
	}


	public void setNgn(double ngn) {
		this.ngn = ngn;
	}


	public double getNio() {
		return nio;
	}


	public void setNio(double nio) {
		this.nio = nio;
	}


	public double getNok() {
		return nok;
	}


	public void setNok(double nok) {
		this.nok = nok;
	}


	public double getNpr() {
		return npr;
	}


	public void setNpr(double npr) {
		this.npr = npr;
	}


	public double getNzd() {
		return nzd;
	}


	public void setNzd(double nzd) {
		this.nzd = nzd;
	}


	public double getOmr() {
		return omr;
	}


	public void setOmr(double omr) {
		this.omr = omr;
	}


	public double getPab() {
		return pab;
	}


	public void setPab(double pab) {
		this.pab = pab;
	}


	public double getPen() {
		return pen;
	}


	public void setPen(double pen) {
		this.pen = pen;
	}


	public double getPgk() {
		return pgk;
	}


	public void setPgk(double pgk) {
		this.pgk = pgk;
	}


	public double getPhp() {
		return php;
	}


	public void setPhp(double php) {
		this.php = php;
	}


	public double getPkr() {
		return pkr;
	}


	public void setPkr(double pkr) {
		this.pkr = pkr;
	}


	public double getPln() {
		return pln;
	}


	public void setPln(double pln) {
		this.pln = pln;
	}


	public double getPyg() {
		return pyg;
	}


	public void setPyg(double pyg) {
		this.pyg = pyg;
	}


	public double getQar() {
		return qar;
	}


	public void setQar(double qar) {
		this.qar = qar;
	}


	public double getRon() {
		return ron;
	}


	public void setRon(double ron) {
		this.ron = ron;
	}


	public double getRsd() {
		return rsd;
	}


	public void setRsd(double rsd) {
		this.rsd = rsd;
	}


	public double getRub() {
		return rub;
	}


	public void setRub(double rub) {
		this.rub = rub;
	}


	public double getRwf() {
		return rwf;
	}


	public void setRwf(double rwf) {
		this.rwf = rwf;
	}


	public double getSar() {
		return sar;
	}


	public void setSar(double sar) {
		this.sar = sar;
	}


	public double getSbd() {
		return sbd;
	}


	public void setSbd(double sbd) {
		this.sbd = sbd;
	}


	public double getScr() {
		return scr;
	}


	public void setScr(double scr) {
		this.scr = scr;
	}


	public double getSdg() {
		return sdg;
	}


	public void setSdg(double sdg) {
		this.sdg = sdg;
	}


	public double getSek() {
		return sek;
	}


	public void setSek(double sek) {
		this.sek = sek;
	}


	public double getSgd() {
		return sgd;
	}


	public void setSgd(double sgd) {
		this.sgd = sgd;
	}


	public double getShp() {
		return shp;
	}


	public void setShp(double shp) {
		this.shp = shp;
	}


	public double getSle() {
		return sle;
	}


	public void setSle(double sle) {
		this.sle = sle;
	}


	public double getSll() {
		return sll;
	}


	public void setSll(double sll) {
		this.sll = sll;
	}


	public double getSos() {
		return sos;
	}


	public void setSos(double sos) {
		this.sos = sos;
	}


	public double getSrd() {
		return srd;
	}


	public void setSrd(double srd) {
		this.srd = srd;
	}


	public double getSsp() {
		return ssp;
	}


	public void setSsp(double ssp) {
		this.ssp = ssp;
	}


	public double getStn() {
		return stn;
	}


	public void setStn(double stn) {
		this.stn = stn;
	}


	public double getSyp() {
		return syp;
	}


	public void setSyp(double syp) {
		this.syp = syp;
	}


	public double getSzl() {
		return szl;
	}


	public void setSzl(double szl) {
		this.szl = szl;
	}


	public double getThb() {
		return thb;
	}


	public void setThb(double thb) {
		this.thb = thb;
	}


	public double getTjs() {
		return tjs;
	}


	public void setTjs(double tjs) {
		this.tjs = tjs;
	}


	public double getTmt() {
		return tmt;
	}


	public void setTmt(double tmt) {
		this.tmt = tmt;
	}


	public double getTnd() {
		return tnd;
	}


	public void setTnd(double tnd) {
		this.tnd = tnd;
	}


	public double getTop() {
		return top;
	}


	public void setTop(double top) {
		this.top = top;
	}


	public double get_try() {
		return _try;
	}


	public void set_try(double _try) {
		this._try = _try;
	}


	public double getTtd() {
		return ttd;
	}


	public void setTtd(double ttd) {
		this.ttd = ttd;
	}


	public double getTvd() {
		return tvd;
	}


	public void setTvd(double tvd) {
		this.tvd = tvd;
	}


	public double getTwd() {
		return twd;
	}


	public void setTwd(double twd) {
		this.twd = twd;
	}


	public double getTzs() {
		return tzs;
	}


	public void setTzs(double tzs) {
		this.tzs = tzs;
	}


	public double getUah() {
		return uah;
	}


	public void setUah(double uah) {
		this.uah = uah;
	}


	public double getUgx() {
		return ugx;
	}


	public void setUgx(double ugx) {
		this.ugx = ugx;
	}


	public double getUyu() {
		return uyu;
	}


	public void setUyu(double uyu) {
		this.uyu = uyu;
	}


	public double getUzs() {
		return uzs;
	}


	public void setUzs(double uzs) {
		this.uzs = uzs;
	}


	public double getVes() {
		return ves;
	}


	public void setVes(double ves) {
		this.ves = ves;
	}


	public double getVnd() {
		return vnd;
	}


	public void setVnd(double vnd) {
		this.vnd = vnd;
	}


	public double getVuv() {
		return vuv;
	}


	public void setVuv(double vuv) {
		this.vuv = vuv;
	}


	public double getWst() {
		return wst;
	}


	public void setWst(double wst) {
		this.wst = wst;
	}


	public double getXaf() {
		return xaf;
	}


	public void setXaf(double xaf) {
		this.xaf = xaf;
	}


	public double getXcd() {
		return xcd;
	}


	public void setXcd(double xcd) {
		this.xcd = xcd;
	}


	public double getXdr() {
		return xdr;
	}


	public void setXdr(double xdr) {
		this.xdr = xdr;
	}


	public double getXof() {
		return xof;
	}


	public void setXof(double xof) {
		this.xof = xof;
	}


	public double getXpf() {
		return xpf;
	}


	public void setXpf(double xpf) {
		this.xpf = xpf;
	}


	public double getYer() {
		return yer;
	}


	public void setYer(double yer) {
		this.yer = yer;
	}


	public double getZar() {
		return zar;
	}


	public void setZar(double zar) {
		this.zar = zar;
	}


	public double getZmw() {
		return zmw;
	}


	public void setZmw(double zmw) {
		this.zmw = zmw;
	}


	public double getZwl() {
		return zwl;
	}


	public void setZwl(double zwl) {
		this.zwl = zwl;
	}


	public int GetNumOfProperties()
	{
		return getClass().getDeclaredFields().length;
	}
	
	public void validatePriceRate() throws IllegalArgumentException, IllegalAccessException {
		Field[] allFields = getClass().getDeclaredFields();
		SoftAssert S2 = new SoftAssert();

		for(int i=0;i<allFields.length;i++) {
//			System.out.println(allFields[i].get(this));
//			System.out.println(allFields[i]);
//				
			S2.assertTrue(Pattern.matches("[0-9]+(.[0-9]+)?", allFields[i].get(this).toString()),"InvalidPrice for currency " +allFields[i]);				
			
        }
		S2.assertAll();
	}

}
