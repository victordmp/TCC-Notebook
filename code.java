@Test
public void testHttpCode(){
    String url = "http://www.hfut.edu.cn/ch/";
    try {
        Page page = requester.getResponse(new CrawlDatum(url));
        assertEquals(200, page.code());
    } catch (Exception e) {
        fail(e.toString());
    }

}