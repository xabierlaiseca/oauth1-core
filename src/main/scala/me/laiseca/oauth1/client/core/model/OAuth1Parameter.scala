package me.laiseca.oauth1.client.core.model

sealed abstract class OAuth1Parameter(val name: String)
case object ConsumerKeyParameter extends OAuth1Parameter("oauth_consumer_key")
case object TokenParameter extends OAuth1Parameter("oauth_token")
case object SignatureMethodParameter extends OAuth1Parameter("oauth_signature_method")
case object SignatureParameter extends OAuth1Parameter("oauth_signature")
case object TimestampParameter extends OAuth1Parameter("oauth_timestamp")
case object NonceParameter extends OAuth1Parameter("oauth_nonce")
case object VersionParameter extends OAuth1Parameter("oauth_version")
case object CallbackParameter extends OAuth1Parameter("oauth_callback")
case object CallbackConfirmedParameter extends OAuth1Parameter("oauth_callback_confirmed")
case object VerifierParameter extends OAuth1Parameter("oauth_verifier")
case object RealmParameter extends OAuth1Parameter("realm")
