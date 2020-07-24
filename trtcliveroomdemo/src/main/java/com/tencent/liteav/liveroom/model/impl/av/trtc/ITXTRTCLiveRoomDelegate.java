package com.tencent.liteav.liveroom.model.impl.av.trtc;

public interface ITXTRTCLiveRoomDelegate {
    void onTRTCAnchorEnter(String userId);

    void onTRTCAnchorExit(String userId);

    void onTRTCStreamAvailable(String userId);

    void onTRTCStreamUnavailable(String userId);
}
