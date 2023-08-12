package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.resp.EbookResp;

import java.util.List;

public interface EbookService {
    public List<EbookResp> list(String name);
}
