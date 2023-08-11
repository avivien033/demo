package com.jiawa.wiki.service.imlp;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.service.EbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookServiceImpl implements EbookService {
   @Resource
    private EbookMapper ebookMapper;
    @Override
    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
